public class Notebook {

    //поля fields //описывают состояние объекта
    int memory; //поле с именим memory типа int
    double weight; //поле с именем weight типа double
    boolean on;
    String color;


    //методы //описывают поведение
    void turnOff(){/*код для выключения ноутбука*/}
    void turnOn(){/*код для включения ноутбука*/}


    //конструкторы
    Notebook(int m, double w, boolean o) {
        memory = m;
        weight = w;
        on = o;
    }

}
