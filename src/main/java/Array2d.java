public class Array2d {
    public static void main(String[] args) {
        // tablica dwuwymiarowa
        int[][] tablica2d = new int[3][5];
        // tablica trzech tablic ,kazda moze przechowywac
        // 5 elementow typu int

        tablica2d[0][0] = 5;
        //pierwszy element pierwszej wartosci

        tablica2d[1][1] = 1;
        tablica2d[1][2] = 2;
        tablica2d[1][3] = 3;
        // drugi, trzeci, czwarty element drugiej tablicy

        tablica2d[2][1] = 4;
        // drugi elemnt trzeciej tablicy

        System.out.println(tablica2d[0][0]);
        System.out.println(tablica2d[0][2]);
        System.out.println(tablica2d[1][3]);
        System.out.println(tablica2d[2][2]);

    }
}
