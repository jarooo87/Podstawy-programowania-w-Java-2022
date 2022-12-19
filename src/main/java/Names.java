public class Names {
    // konstruktory klas
    String name;
    static int liczebnosc = 0;
    // static dziala na rzecz calej klasy
    // a nie konkretnego obiektu
    Names(){
        liczebnosc++;
    }
    Names(String name){
        this.name = name;
        liczebnosc++;
    }

}
