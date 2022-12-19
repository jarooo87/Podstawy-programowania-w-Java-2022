public class MainClass {
    public static void main(String[] args) {
        // nazwy klas piszemy z duzej litery
        Cars auto1 = new Cars();
        System.out.println(auto1.liczbaAut);
        // jezeli nawiasy puste to konstruktor domyslny
        auto1.nazwa = "Citroen";
        auto1.model = "Grand C4";
        System.out.println(auto1.model);
        auto1.jakiModel();
        auto1.jakaNazwa();

        Cars auto2 = new Cars();
        System.out.println(auto2.liczbaAut);
        auto2.nazwa = "Ford";
        auto2.model = "Focus";
        auto2.jakiModel();

    }
}
