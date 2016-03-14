public class TemperatureConverter {
    /*
    1. Создайте новый класс и назовите его TemperatureConverter.
    Добавьте в него метод для преобразования температур, с такой сигнатурой:
    public String convertTemp (int temperature, char convertTo)
    Если аргумент convertTo равен F, то температура должна быть преобразована
    в Фаренгейты, если C, то в Цельсии. Когда вы будете вызывать этот
    метод, поместите значение аргумента типа char в одинарные кавычки.
    2. Объявите метод convertGrades() класса ReportCard как статический
    и удалите строку инициализации класса из метода main(). */

    int temp;

    public int convertTemp(int temperature, char convertTo) {

        switch (convertTo) {
            case 'F': System.out.println(temp = 9/5* temperature + 32);break;
            //case 'C': System.out.println(temp = 5/9* (temperature - 32));break;
        }
        return temp ;
    }

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertTemp(100, 'F');
    }
}