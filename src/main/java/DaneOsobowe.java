public class DaneOsobowe {
    int wiek;
    String imie;
    String nazwisko;

    public void wiekMetoda(int jakiWiek){
        //System.out.println(" Wiek osoby to : " + wiek);
        wiek = jakiWiek;
    }
    public void imieMetoda(String jakieImie){
        //System.out.println(" Imie osoby to : " + imie);
        imie = jakieImie;
    }
    public void nazwiskoMetoda(String jakieNazwisko){
        //System.out.println(" Nazwisko osoby to : " + nazwisko);
        nazwisko = jakieNazwisko;
    }
    public String toString(){
        return "Osoba "  + imie + " " + nazwisko + " ma " + wiek + " lat.";
    }
}
