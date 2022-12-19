import java.util.ArrayList;
import java.util.Collections;

public class Repeat {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rafal");
        names.add("Andrzej");
        names.add("Zenek");
        names.add("Marek");
        names.add("Marek");
        System.out.println(Collections.min(names));
        for (String z:names
             ) {
            System.out.println(z);
        }
        System.out.println("-------");
        Collections.sort(names);
        for (String z:names
             ) {
            System.out.println(z);
        }
        System.out.println("-----");
        System.out.println(Collections.max(names));
        Collections.reverse(names);
        System.out.println("--------");
        for (String z:names
             ) {
            System.out.println(z);
        }
        if(names.contains("Andrzej")){
            System.out.println("ArrayLista zawiera to imie");
        }else{
            System.out.println("ArrayLista nie zawiera tego imienia");
        }
        int liczbaImion = Collections.frequency(names, "sjas");
        System.out.println(liczbaImion);
    }
}
