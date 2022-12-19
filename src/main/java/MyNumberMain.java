public class MyNumberMain {
    public static void main(String[] args) {

        // kopiowanie wartosci zmiennych oraz obiektow
        int numer = 10;
        System.out.println( "Numer przed zmiana :" + numer);
        zamiana(numer);
        System.out.println("Numer po zmianie :" + numer);
        MyNumber obiektNumer = new MyNumber();
        obiektNumer.numer = 10;
        System.out.println("Obiekt numer przed zmiana :" + obiektNumer.numer);
        zamiana(obiektNumer);
        System.out.println("Obiekt numer po zmianie :" + obiektNumer.numer);
    }
    public static void zamiana(int numer){
        numer = 5;
        System.out.println("Numer w metodzie :" + numer);
    }
    public static void zamiana (MyNumber obiektNumer){
        obiektNumer.numer = 5;
    }

}
