public class Robert extends Imiona{
    String imie;
    Robert(String imie) throws InneImiona{
        if (imie.length()==0){
            throw new InneImiona();
        }this.imie=imie;
    }

    @Override
    public void liczbaOsob() {
        System.out.println("Liczba osób o imieniu Robert");
    }
    public void nazwisko(){
        System.out.println("Nazwiska z imieniem Robert");
    }
}
