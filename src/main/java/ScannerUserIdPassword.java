import java.util.Scanner;

public class ScannerUserIdPassword {
    public static void main(String[] args){
       String user;
       String password;
       do {
           System.out.println(" Enter your user name :");
           user = getLogPass();
           System.out.println("Enter password :");
           password = getLogPass();

       }while(!user.equals("Programista1") || !password.equals("Komputer"));
       System.out.println(" Welcome Programista1");
    }
    public static String getLogPass(){
        return new Scanner(System.in).nextLine();
    }
}
