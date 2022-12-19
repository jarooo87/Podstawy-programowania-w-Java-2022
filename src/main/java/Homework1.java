import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        char znak = 'a';
        while(znak <= 'z'){
            System.out.println(znak);
            znak ++;
        }

        int monthNumber;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiaca ");
        monthNumber = myScanner.nextInt();

        switch(monthNumber) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            default:
                System.out.println("Nieprawidłowy numer miesiaca !!");
                break;
        }




    }
}
