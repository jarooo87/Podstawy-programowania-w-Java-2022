

public class NewCar extends Vehicle {
    NewCar(String name, int hp){
        super(name,hp);
        System.out.println("konstruktor klasy NewCar");
    }
    boolean lightsOn = false;
    void lights(){
        lightsOn= !lightsOn;
        if(lightsOn){
            System.out.println("Swiatla wlaczone");
        }else{
            System.out.println("Swiatla wylaczone");
        }
    }


}
