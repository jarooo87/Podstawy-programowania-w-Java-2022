public class Vehicle {
    String name;
    int hp;

    Vehicle(String name, int hp){
        this.name =name;
        this.hp=hp;
        System.out.println("Konstruktor klasy Vehicle");
    }
    protected void engine(){
        System.out.println("Silnik wlaczony");

    }


}
