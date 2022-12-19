import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> mojaLista = new LinkedList<>();
        mojaLista.add("JAN");
        mojaLista.add("MAREK");
        mojaLista.add("ANDRZEJ");
        mojaLista.add("ANDRZEJ");
        // LinkedLista dopuszcza duplikowanie wartosci
        mojaLista.remove(0);
        for (String z:mojaLista
             ) {
            System.out.println(z);
        }
        mojaLista.clear();
        System.out.println("-------------");
        for(String z:mojaLista){
            System.out.println(z);
        }
    // HashMap przyjmuje klucz i wartosc

        HashMap<Integer,String> mojaHashMapa = new HashMap<>();
        mojaHashMapa.put(1,"Styczeń");
        mojaHashMapa.put(7,"Marzec");
        mojaHashMapa.put(6,"Czerwiec");
        mojaHashMapa.put(12,"Grudzien");
        mojaHashMapa.put(13,"Grudzien");

        System.out.println(mojaHashMapa.get(6));
        System.out.println("0000000000000000");


        for (String z: mojaHashMapa.values()
             ) {
            System.out.println(z);
        }

        //HashSet
        LinkedHashSet<String> mojHashSet = new LinkedHashSet<>();
        mojHashSet.add("Krakow");
        mojHashSet.add("Warszawa");
        mojHashSet.add("Poznan");
        mojHashSet.add("BILGORAJ");
        mojHashSet.add("BILGORAJ");

        System.out.println("----------");

        for (String z: mojHashSet
             ) {
            System.out.println(z);
        }
        System.out.println(mojHashSet.size());
        System.out.println("----------------");
        for (String z: mojHashSet
             ) {
            System.out.println(z);
        }
        System.out.println("------------");
        System.out.println(mojHashSet.size());
        // HashSet musi przechowywac elementy unikatowe
        // roznica HashSet od Array/LinkedList polega na tym
        // iz duplikujac wartosc zostanie ona pominieta




    }
}
