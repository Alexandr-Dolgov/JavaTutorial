public class CarOwner {
    public static void main(String[] args) {

        Car myCar = new Car();
        JameBondCar jameBondCar = new JameBondCar();

        myCar.start();

        myCar.stop();


        System.out.println(myCar.drive(1));

        System.out.println(jameBondCar.drive(1));
    }
}
