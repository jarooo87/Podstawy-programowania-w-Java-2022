public class ChristmasTree {
    public static void main(String[] args) {

        //  System.out.println("  *");
        //System.out.println(" * *");
        // System.out.println("* * *");
        int height = 10;
        //tworzymy petle ktora okresla wyysokosc drzewa
        for (int i = 1; i <= height; i++) {
            // tworzymy petle do wyswietlania spacji
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
                //tworzymy petle ktora wyswietli nam gwiazdki
            }
            for (int star = 1; star <= i * 2 - 1; star++) {
                System.out.print("*");
            }

                System.out.println();

        }
    }
}