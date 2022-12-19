public class Arrays {
    public static void main(String[] args) {
        // String name = "JAN";
        // String name2 = 'MAREK";
        String[] tablica = new String[10];
        //zaczynamy liczenie od 0 to najmniejszy indeks
        tablica[0] = "JAN";
        tablica[1] = "MAREK";
        tablica[2] = "ADRIAN";
        System.out.println(tablica[1]);
        System.out.println(tablica.length);
        for(int i=0;i< tablica.length;i++){
            System.out.println(tablica[i]);
        }
        for(int i = tablica.length-1;i>=0;i--){
            System.out.println(tablica[i]);
        }
        int[] tablica2 = new int[5];
        tablica2[0] = 1;
        tablica2[3] = 8;
       for(int i =0; i< tablica2.length; i++){
            System.out.println(tablica2[i]);
        }
        int[] tablica3 ={1,34,656,-343,38};
        String[] tablica4 = {"JAN", "MAREK","ADRIAN","RAFAL"};
        // for each
        for(String nazwaFor : tablica4){
            System.out.println(nazwaFor);
        }
        // znajdywanie konkretnej liczby w tablicy
        boolean numberFound = false;
        int[] numbers = {23,834,-735,4334,873,2442,75};
        int numberToFind = 7;
        for(int i =0; i<numbers.length;i++) {
            if(numbers[i] == numberToFind) {
                numberFound = true;
                break;
                // znalezlismy liczbe zatrzymujemy petle
            }
        }
       if(numberFound) {
           System.out.println("Liczba zostala znaleziona");
       }else {
           System.out.println(" Liczba nie znaleziona");
       }
    }
}
