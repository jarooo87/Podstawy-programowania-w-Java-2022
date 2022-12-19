public class Homework3 {
    public static void main (String[] args){
        double[] myArray = {3.2,8.5,9.2,6.7,3.1};

        // wypisz wszystkie elementy tablicy
        for(int i =0;i< myArray.length;i++){
            System.out.println(myArray[i]);
        }
        // sumujemy wszytskie elemnty tablicy
        double summary = 0;
        for(int i =0;i< myArray.length;i++){
            summary = summary + myArray[i];
        }
        System.out.println(" Suma rowna sie : " + summary);

        // najwieksza liczba z tablicy
        double max = myArray[0];
        for(int i =1; i<myArray.length;i++){
            if(myArray[i] > max) max = myArray[i];

        }
        System.out.println("Najwieksza liczba : " + max);
    }
}
