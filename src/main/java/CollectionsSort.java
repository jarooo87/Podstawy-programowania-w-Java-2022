import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        // sortowanie i operacje na kolekcjach

        ArrayList<String> lista = new ArrayList<>();
        lista.add("TOMEK");
        lista.add("ARTUR");
        lista.add("MARIUSZ");
        lista.add("DAREK");
        for (String z:lista
             ) {
            System.out.println(z);
        }
        System.out.println("-------------");
        Collections.sort(lista);
        for (String z:lista
        ) {
            System.out.println(z);
        }
        System.out.println("----------");
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
        System.out.println("-------------");
        Collections.reverse(lista);
        for (String z:lista
        ) {
            System.out.println(z);
        }
        System.out.println("-----------");
        Collections.shuffle(lista);
        for (String z:lista
        ) {
            System.out.println(z);
        }
        // tworzymy liste w ktorej sortujemy obiekty
        ArrayList<Colors> kolory = new ArrayList<>();
        Colors kolor1 = new Colors("Red");
        Colors kolor2 = new Colors("Green");
        Colors kolor3 = new Colors("Black");
        Colors kolor4 = new Colors("Blue");
        Colors kolor5 = new Colors("Blue");

        kolor4.numberOfColors = 10;

        kolory.add(kolor1);
        kolory.add(kolor2);
        kolory.add(kolor3);
        kolory.add(kolor4);
        kolory.add(kolor5);


        for (Colors z:kolory
             ) {
            System.out.println(z.name + " " + z.numberOfColors + "odcieni");
        }
        //Collections.sort(kolory); to sie nie uda jezeli jest brak
        // metody wg ktorej java ma posortowac nasze obiekty
        System.out.println("---------------");
        Collections.sort(kolory);
        for (Colors a:kolory
             ) {
            System.out.println(a.name + " " + a.numberOfColors + "odcieni");
        }
        System.out.println("----------");
        for (Colors a:kolory
        ) {
            System.out.println(a.name + " " + a.numberOfColors + "odcieni");
        }


    }
}
