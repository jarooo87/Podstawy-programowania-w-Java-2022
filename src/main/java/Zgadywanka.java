import java.util.Random;
import java.util.Scanner;

public class Zgadywanka {
    public static void main(String[] args){

        // gra zgadywanka z komputerem
        //deklaruje zmienna(licznik) ile razy zgadywalem
        int i =0;
        // deklarujemy zmienna wylosowana przez komputer

        int liczbaLosowa ;
        // deklarujemy zmienna odebrana od uzytkownika
        int odpowiedz;
        Random myRandom = new Random();
        liczbaLosowa =myRandom.nextInt(10);
        //for(int j=20; j>0; j--){
          //  System.out.println(myRandom.nextInt(10) +1);
        //}
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbe w przedziale 1-10");

        do{
            // zwiekszamy nasz licznik na poczatku petli
            i++;
            System.out.println("Zgadnij liczbę : ");
            odpowiedz = myScanner.nextInt();
            if(odpowiedz > 10 || odpowiedz<0) {
                System.out.println("Liczba musi być w przedziale 1-10");
            } else if(odpowiedz> liczbaLosowa){
                System.out.println("Nie zgadles moja liczba jest mniejsza");
            }else if(odpowiedz<liczbaLosowa){
                System.out.println("Nie zgadles moja liczba jest wieksza");
            }
        }while (odpowiedz != liczbaLosowa);
        System.out.println("Udalo Ci sie odgadnac za "  + i + "proba" );
    }
}
