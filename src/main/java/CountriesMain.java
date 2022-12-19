import java.util.ArrayList;

public class CountriesMain {
    public static void main(String[] args) {
        Countries panstwo1 = new Countries("Poland");
        Countries panstwo2 = new Countries("France");
        Countries panstwo3 = new Countries("Sweden");

        //ArrayList 2 typy generyczny i niegeneryczny
        // typ niegeneryczny
        ArrayList list = new ArrayList();
        list.add(panstwo1);
        list.add(panstwo2);
        list.add(panstwo3);
        //list.add(1098);

        for (Object mojNazwa:list){
            System.out.println(((Countries)mojNazwa).name);
        }
        System.out.println(((Countries)list.get(0)).name);
        System.out.println(list.contains(panstwo3));
        System.out.println(list.contains(5));
        list.remove(panstwo2);
        System.out.println("-------------");
        for (Object x:list
             ) {
            System.out.println(((Countries)x).name);
        }
        // arrayList generyczna

        ArrayList<Countries> genericList = new ArrayList<>();
        genericList.add(panstwo1);
        genericList.add(panstwo2);
        genericList.add(panstwo3);
        //genericList.add(10);
        // ArrayList generyczna nie przepusci tego juz na
        //etapie pisania  kodu
        System.out.println(genericList.size());
        System.out.println(genericList.get(0).name);

        for (Countries z:genericList
             ) {
            System.out.println(z.name);
        }

    }
}
