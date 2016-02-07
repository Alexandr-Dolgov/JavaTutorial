import java.nio.charset.Charset;
import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.util.Hashtable;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;

public class PT {
        private static MyLib lib;
        private static Charset cset = Charset.forName("Cp1251");

        public static Hashtable<Integer, Node> nodes = new Hashtable<Integer, Node>();

        public interface MyLib extends Library {
                 void startpt(int i);
                 void show(byte[] s);
                 void task(byte[] name);
                 void freept();
                 void checkpt(Memory s, IntByReference i );
                 void raisept(String s1, String s2 );
                 void hidetask();
                 void getn(IntByReference i);
                 void putn(Integer i);
                 void getr(DoubleByReference d);
                 void putr(Double d);
                 void gets(Memory s);
                 void puts(byte[] s2);
                 void getc(Pointer c1);
                 void putc(byte c2);
                 void getb(Boolean b);
                 void putb(Boolean b);
                 void putp(int p);
                 void pterrormes(Memory s);
                 void nodenew(IntByReference n, int d, int next, int prev,
                         int left, int right, int parent);
                 void nodegetp(IntByReference n);
                 void nodegetf(int n, int fn, IntByReference f, IntByReference err);
                 void nodesetf(int n, int fn, int f, IntByReference err);
                 void nodedispose(int n, IntByReference err);
                 int finishpt(); // PT 4.13
        }

        public static double getDouble(){
                DoubleByReference d = new DoubleByReference();
                lib.getr(d);
                return d.getValue();
        }
        public static boolean getBoolean(){
                boolean b = false;
                lib.getb(b);
                return b;
        }
        public static int getInt(){
                IntByReference i = new IntByReference();
        lib.getn(i);
                return i.getValue();
        }
        public static String getString(){
                Memory myStr = new Memory(80);
                lib.gets(myStr);
                return new String(myStr.getByteArray(0, myStr.getString(0).length()), cset);
        }
        public static char getChar(){
                Pointer myStr = new Memory(Pointer.SIZE);
                lib.getc(myStr);
                return cset.decode(myStr.getByteBuffer(0, 1)).charAt(0);
        }

        public static Node getNode(){
                IntByReference n = new IntByReference();
                lib.nodegetp(n);
                return Node.IntToNode(n.getValue());
        }


        public static void put(Object... obj){
            if (obj == null){
                        lib.putp(0);
                }
            else
            {
            for (int i = 0; i < obj.length; i++)
            {
            if(obj[i] == null){
                        lib.putp(0);
                }
            else
                if(obj[i].getClass()==Integer.class){
                        lib.putn((Integer)obj[i]);
                }
            else
                if(obj[i].getClass()==Double.class){
                        lib.putr((Double)obj[i]);
                }
            else
                if(obj[i].getClass()==Boolean.class){
                        lib.putb((Boolean)obj[i]);
                }
            else
                if(obj[i].getClass()==String.class){
                    lib.puts(cset.encode((String)obj[i]+'\0').array());
                }
            else
                if(obj[i].getClass()==Character.class){
                    lib.putc(cset.encode("" + (Character)obj[i]).array()[0]);
                }
            else
                if(obj[i].getClass()==Node.class){
                        lib.putp(((Node)obj[i]).a);
                }
            else{
                throw new IllegalArgumentException("The Put method has an argument of invalid type: "+
                        obj[i].getClass().getName()+".");
                }

            }
            }
        }
        public static void task(String s){
               lib.task(cset.encode(s+'\0').array());
        }
        public static void show(Object obj)
        {
                 lib.show((obj.toString()+'\0').getBytes(cset));
        }
        public static void showLine(Object obj){
               show(obj + "\r\n");
        }
        public static void showLine(){
               showLine("");
        }
        @SuppressWarnings("deprecation")
        public static void Check()
        {
        IntByReference i = new IntByReference();
        Memory s = new Memory(500);
        lib.checkpt(s,i);
          if (i.getValue() == 0 && s.getSize() > 0)
              lib.pterrormes(s);
        lib.freept();
        }
        public static void RaisePT(Exception e)
        {
                lib.raisept(e.getClass().getName(),e.getMessage());
        }

        public static class Node {
                private int a;
                private boolean disposed;

                private Node(int addr, int none) {
                        a = addr;
                        disposed = false;
                        nodes.put(a, this);
                }

                private static int NodeToInt(Node node)
                {
                   if (node == null)
                       return 0;
                   return node.a;
                }

                private static Node IntToNode(int a)
                {
                   if (a == 0)
                       return null;
                   if (nodes.containsKey(a))
                       return nodes.get(a);
                   return new Node(a, 0);
                }

                private Node(int data, Node next, Node prev, Node left,
                        Node right, Node parent) {
                      IntByReference n = new IntByReference();
                      lib.nodenew(n, data, NodeToInt(next), NodeToInt(prev),
                              NodeToInt(left), NodeToInt(right), NodeToInt(parent));
                      a = n.getValue();
                      disposed = false;
                      nodes.put(a, this);
                }

                public Node(){
                    this(0, null, null, null, null, null);
                }

                public Node(int data){
                    this(data, null, null, null, null, null);
                }

                public Node(int data, Node next){
                    this(data, next, null, null, null, null);
                }

                public Node(int data, Node next, Node prev){
                    this(data, next, prev, null, null, null);
                }

                public Node(Node left, Node right, int data){
                    this(data, null, null, left, right, null);
                }

                public Node(Node left, Node right, int data, Node parent){
                    this(data, null, null, left, right, parent);
                }

                public int getData() throws Exception{
                    if (disposed)
                      throw new IllegalAccessException("cannot access a disposed Node");
                    IntByReference val = new IntByReference();
                    IntByReference err = new IntByReference();
                    lib.nodegetf(a, 0, val, err);
                    if (err.getValue() != 0)
                      throw new IllegalAccessException("cannot get the Data property");
                    return val.getValue();
                }

                public void setData(int value) throws Exception{
                    if (disposed)
                      throw new IllegalAccessException("cannot access a disposed Node");
                    IntByReference err = new IntByReference();
                    lib.nodesetf(a, 0, value, err);
                    if (err.getValue() != 0)
                      throw new IllegalAccessException("cannot set the Data property");
                }

                private Node getNodeProp(int n, String name) throws Exception{
                    if (disposed)
                      throw new IllegalAccessException("cannot access a disposed Node");
                    IntByReference val = new IntByReference();
                    IntByReference err = new IntByReference();
                    lib.nodegetf(a, n, val, err);
                    if (err.getValue() != 0)
                      throw new IllegalAccessException("cannot get the "+name+" property");
                    return IntToNode(val.getValue());
                }

                public void setNodeProp(int n, String name, Node value) throws Exception{
                    if (disposed)
                      throw new IllegalAccessException("cannot access a disposed Node");
                    IntByReference err = new IntByReference();
                    lib.nodesetf(a, n, NodeToInt(value), err);
                    if (err.getValue() != 0)
                      throw new IllegalAccessException("cannot set the "+name+" property");
                }

                public Node getNext() throws Exception {
                        return getNodeProp(1, "Next");
                }

                public void setNext(Node value) throws Exception {
                        setNodeProp(1, "Next", value);
                }

                public Node getPrev() throws Exception {
                        return getNodeProp(2, "Prev");
                }

                public void setPrev(Node value) throws Exception {
                        setNodeProp(2, "Prev", value);
                }

                public Node getLeft() throws Exception {
                        return getNodeProp(3, "Left");
                }

                public void setLeft(Node value) throws Exception {
                        setNodeProp(3, "Left", value);
                }

                public Node getRight() throws Exception {
                        return getNodeProp(4, "Right");
                }

                public void setRight(Node value) throws Exception {
                        setNodeProp(4, "Right", value);
                }

                public Node getParent() throws Exception {
                        return getNodeProp(5, "Parent");
                }

                public void setParent(Node value) throws Exception {
                        setNodeProp(5, "Parent", value);
                }
                void dispose() throws Exception {
                    if (disposed)
                        return;
                    IntByReference err = new IntByReference();
                    lib.nodedispose(a, err);
                    disposed = true;
                }
        }


        public interface User32 extends StdCallLibrary {
            User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);
            int MessageBoxA(int hwnd, String text, String caption, int type);
        }

        public static final String INFO =
                       "Не удалось загрузить библиотеку PT4.dll.\nВероятно, используется 64-разрядная версия пакета Java SDK,\n"
                               + "не поддерживаемая электронным задачником Programming Taskbook.\n"
                               + "Если используется среда NetBeans, то переустановите ее, связав с ней 32-разрядный пакет Java SDK.\n"
                               + "Если используется среда Eclipse, то выполните команду \"Window|Preferences\", в окне Preferences перейдите в раздел \"Java|Installed JREs\" и выберите в нем вариант с 32-разрядным пакетом Java SDK.";

        public static void start()
        {
            try
            {
               lib = (MyLib) Native.loadLibrary("pt4", MyLib.class);
            }
            catch(UnsatisfiedLinkError e)
            {
               User32 user32 = User32.INSTANCE;
               System.setProperty("jna.encoding", "Cp1251");
               user32.MessageBoxA(0, INFO, "Error", 0);
               return;
            }
            for (int i = 0; i < 9; i++)
            {
                lib.startpt(1048576);
                nodes.clear();
                try
                {
                   MyTask.solve();
                }
                catch(Exception e)
                {
                    RaisePT(e);
                }
                Check();
                if (lib.finishpt() == 1)
                    break;
            }

        }

}



