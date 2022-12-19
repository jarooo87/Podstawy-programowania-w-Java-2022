public class Dziedziczenie {
    public static void main(String[] args) {
        // dziedziczenie klas i konstruktorow
        NewCar car1 = new NewCar("Ferrari", 500);
        car1.name = "Ferrari";
        car1.hp = 500;
        System.out.println(car1.name + " posiada " + car1.hp + " koni ");
        car1.engine();
        car1.lights();
        car1.lights();
        car1.lights();
        car1.lights();
        OldCar car2 = new OldCar("Cadillac", 300);
        car2.name = "Cadillac";
        car2.hp = 300;
        car2.engine();
        car2.lights();

    }
}
