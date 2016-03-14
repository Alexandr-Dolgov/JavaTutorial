public class JameBondCar extends Car {

    int distance;

    public int drive(int howlong){
        distance = howlong*180;
        return distance;
    }
}
