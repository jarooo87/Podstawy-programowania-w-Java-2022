public class NamesMain {
    public static void main(String[] args) {

        // konstruktory klas
        Names name1 = new Names();
        name1.name = "Jan";
        System.out.println(name1.name);
        Names name2 = new Names("Marek");
        System.out.println(name2.name);
        Names name3 = new Names("Rafal");
        System.out.println(name3.name);
        System.out.println(name3.liczebnosc);
    }
}
