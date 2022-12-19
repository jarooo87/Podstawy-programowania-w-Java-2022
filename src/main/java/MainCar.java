public class MainCar {
    public static void main(String[] args) {
        Car myCar1 = new Car(){
            @Override
            public void startEngine() {
                System.out.println("Engine myCar1 has started");

            }
        };
        myCar1.startEngine();
        Car myCar2 = new Car();
        myCar2.startEngine();
        myCar2.lockDoors();
        myCar1.lockDoors();
        Car.ThreeDoorsCar lambo = myCar1.new ThreeDoorsCar();
    }
}
