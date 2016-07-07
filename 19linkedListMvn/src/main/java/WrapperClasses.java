import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {
        //старый стиль
        int i = 10;
        Integer wi = new Integer(i);
        int ii = wi.intValue();

        //новый стиль (autoboxing/autounboxing)
        Integer wj = 15;
        int j = wj;

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(18L);
        arrayList.add(18d);
        arrayList.add(18F);

        byte b = 8;
        arrayList.add(b);
        arrayList.add((byte)9);

        short s = 22;
        arrayList.add(s);
        arrayList.add((short)23);

        arrayList.add('r');
        arrayList.add('\u0030');

        arrayList.add(true);
        arrayList.add(false);


    }

}
