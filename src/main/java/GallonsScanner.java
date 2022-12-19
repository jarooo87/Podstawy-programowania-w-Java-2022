import java.util.Scanner;

public class GallonsScanner {

    public static void main(String[] args){

        Scanner mojSkaner = new Scanner(System.in);

        int gallons;
        int liters;

        System.out.println(" Podaj liczbę galonów ");
        gallons = mojSkaner.nextInt();
        double sum = gallons * 3.78541178;
        System.out.println(gallons + " galonów to " + sum + " litrów ");





    }
}
