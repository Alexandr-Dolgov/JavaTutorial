public class Car {
//1. Создайте новый класс Car (автомобиль) и включите в него следующие методы:
//public void start()
//public void stop()
//public int drive(int howlong)
//Метод drive()(едь) должен возвращать общее расстояние пройденное автомобилем за заданное время.
//Используйте следующую формулу дла рассчёта расстояния: distance = howlong*60;
//2. Создайте ещё один класс CarOwner (хозяин автомобиля),который будет //создавать экземпляр объекта Car и вызывать
// его методы. Результат каждого такого вызова должен быть напечатан с  помощью System.out.println().
//3. Сделайте подкласс класса Car, назовите его JamesBondCar автомобиль
//Джемса Бонда) и переопределите в нем метод drive(). Используйте
//следующую формулу дла рассчёта расстояния: distance = howlong*180;
//Будьте изобретательны! Печатайте смешные сообщения.
    int distance;

    public void  start(){
        System.out.println("start");
    }

    public void stop(){
        System.out.println("stop");

    }
    public int drive(int howlong){
        distance = howlong*60;
        return distance;
    }
}
