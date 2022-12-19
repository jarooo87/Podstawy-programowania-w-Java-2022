public class Swinka extends Zwierzeta implements Jedzonko {

   int liczbaSwinek;
    Swinka(String nazwa, int liczbaSwinek) {
        super(nazwa);
        this.liczbaSwinek=liczbaSwinek;
    }

    @Override
    public void siano() {
        System.out.println("Dobre siano");
    }

    @Override
    public void pasza() {
        System.out.println("Pyszna pasza");
    }
}

