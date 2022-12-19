import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner mojSkaner = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            double number = mojSkaner.nextDouble();
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("To nie jest liczba");
        }
    }
}
