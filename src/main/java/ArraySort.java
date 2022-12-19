import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int numbers[] = {12,653,-846,34,324,3243,566,565,4,33};
        int size = 10;

        System.out.println("Pokaz nieposortowana tablice");
        for(int i = 0;i<size;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Sortujemy tablice");
        Arrays.sort(numbers);
        for(int i =0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }
    }
}
