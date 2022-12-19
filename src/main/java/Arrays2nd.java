public class Arrays2nd {
    public static void main(String[] args) {
        // znajdujemy najwieksza i najmniejsza liczbe

        int nmbr[] = new int[6];
        int min;
        int max;

        nmbr[0] = 12;
        nmbr[1] = 763;
        nmbr[2] = -978;
        nmbr[3] = 5326;
        nmbr[4] = 232232;
        nmbr[5] = 1778;

        min = max = nmbr[0];

        for(int i =1;i<6;i++) {
            if (nmbr[i] < min) min = nmbr[i];
            if (nmbr[i] > max) max = nmbr[i];

        }
        System.out.println(" Najmniejsza wartosc to : " + min + "Najwieksa wartosc to " + max);

        int numTable[]= {1,2,3,4,5,6,7,8,9,10};
        int summary = 0;
        for( int x : numTable) {
            System.out.println(" Wartosc elementu" + x);
            summary = summary + x;
        }
        System.out.println("Suma elementow  " + summary);

       // porownujemy dwie tablice

       int[] pierwszaTablica = {10,5,20};
       int[] drugaTablica = {10,5,20};

       if(pierwszaTablica.length != drugaTablica.length){
           System.out.println("TABLICE SA ROZNE");
       }else {
           boolean czyZnalezionoRoznice = false;
           for(int i =0;i < pierwszaTablica.length;i++) {
               if(pierwszaTablica[i] != drugaTablica[i]) {
                   czyZnalezionoRoznice = true;
                   break;
               }
           }
           if(czyZnalezionoRoznice) {
               System.out.println("Tablice nie sa takie same");
           }else{
               System.out.println("TABLICE SA TAKIE SAME");
           }
       }
    }
}
