public class DaneOsoboweMain {
    public static void main(String[] args){
        DaneOsobowe osoba1 = new DaneOsobowe();
        osoba1.imie = ("Jan");
        osoba1.nazwisko = ("Kowalski");
        osoba1.wiek = (30);
        System.out.println(osoba1.imie);
        System.out.println(osoba1.wiek);
        System.out.println(osoba1.nazwisko);
        System.out.println(osoba1.toString());
        DaneOsobowe osoba2 = new DaneOsobowe();
        osoba2.imie = ("Marek");
        osoba2.nazwisko = ("Kowal");
        osoba2.wiek = (40);
        System.out.println(osoba1.toString());
        osoba1.toString();

    }
}
