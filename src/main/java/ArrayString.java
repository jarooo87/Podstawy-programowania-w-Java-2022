import java.util.Arrays;
import java.util.Collections;

public class ArrayString {
    public static void main(String[] args) {
        String[] myTable = {"A","M","T","D","R","E"};
        System.out.println("nieposortowana tablica : " + Arrays.toString(myTable));

        Arrays.sort(myTable);
        System.out.println("posortowana tablica " + Arrays.toString(myTable));
        String[] myTable2 = {"E", "H", "A", "K"};
        Arrays.sort(myTable2, Collections.reverseOrder());
        System.out.println("posortowana od tylu " + Arrays.toString(myTable2));
    }
}
