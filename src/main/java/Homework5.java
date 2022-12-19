import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args){
        System.out.println("Podaj dlugosc podstawy dolnej trapezu :");
        double a = myScanner();
        System.out.println("Podaj dlugosc podstawy gornej trapezu");
        double b = myScanner();
        System.out.println("Podaj wysokosc trapezu :");
        double h = myScanner();

        double wynikPolaTrapezu = poleTrapezu(a,b,h);
        System.out.println("Pole trapezu wynosi : " + wynikPolaTrapezu);


    }
   public static double myScanner(){
        return new Scanner(System.in).nextInt();
   }
   public static double poleTrapezu(double a,double b,double h){
        return 0.5 * (a+b) * h;
   }
}
