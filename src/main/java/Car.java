public class Car {
    public void startEngine(){
        System.out.println("Engine has started");
    }
    public void lockDoors(){
        System.out.println("Doors locked");
    }
    // KLASY WEWNETRZNE
    public class ThreeDoorsCar{
       String name;
       public void nameOfCar(){
           System.out.println(name);
       }

    }
}
