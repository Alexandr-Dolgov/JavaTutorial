public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive(95);//вызов метода dive с разными параметрами
        myFish.dive(3);
        myFish.dive(5);
        myFish.sleep();
        System.out.println(myFish.say("Привет"));
    }
    public static void sleep(){//метод можно вызвать из другого класса public
        //не возвращает никаких данных void
        //пустые () не имеет параметров
        System.out.println("Спокойной ночи! До завтра");

    }
}
