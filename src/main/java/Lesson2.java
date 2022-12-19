import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.MIN_VALUE;

public class Lesson2 {

    //typy danych zmienne i stale
    public static void main (String[] args){

        // char to inaczej znak
        char myChar = 'a'; //tylko jeden znak
        System.out.println(myChar);
        String myName = "Jan";
        System.out.println(myName);
        boolean myBool = true;
        System.out.println(myBool);
        byte myByte = Byte.MIN_VALUE;
        byte myByte2 = Byte.MAX_VALUE;
        System.out.println(" Byte  " +myByte +  " do " + myByte2);
        short myShort = Short.MIN_VALUE;
        short myShort2 = Short.MAX_VALUE;
        System.out.println(" Byte" + myShort + "do" + myShort2);
        int myInt = Integer.MIN_VALUE;
        int myInt2 = Integer.MAX_VALUE;
        System.out.println(" Int" + myInt + "do" + myInt2);
        long myLong = Long.MIN_VALUE;
        long myLong2 = Long.MAX_VALUE;
        System.out.println(" Long" + myLong + "do" + myLong2);
        long myLong3 = 7216327163521635L;
        // Float - przechowuje liczby zmiennoprzecinkowe
        float myFloat = 12.43f;
        float myFloat2 = MIN_VALUE;
        float myFloat3 = MAX_VALUE;
        System.out.println("Float" + myFloat2 + " do" + myFloat3);
        // double - przechowuje liczbyc zmiennoprzecinkowe wiekszej wartosci
        double myDouble = 44.32;
        double myDouble2 = Double.MIN_VALUE;
        double myDouble3 = Double.MAX_VALUE;
        System.out.println("Double" + myDouble2 + " do" + myDouble3);
        int a = 222 + 2;
        int aa = 300;
        int myInt4 = 3232;
        myInt4 = 4000;




    }
}
