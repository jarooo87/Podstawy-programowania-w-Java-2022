import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class KolejkaStos {
    public static void main(String[] args) {
        // kolejka i stos ostatnie elementy kolekcji

        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("Jeden");
        kolejka.add("Dwa");
        kolejka.add("Trzy");
        System.out.println(kolejka.size());
        // w kolejce element ktory wszedl jako pierwszy musi
        // byc usuniety jako pierwszy
        // FIFO - first in first out
        System.out.println(kolejka.remove());
        System.out.println(kolejka.size());
        System.out.println(kolejka.size());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());


        // stos

        Stack<String> stos = new Stack<>();
        // ostatni elemnt pierwszy opuszcza stos
        //LIFO- last in first out
        stos.push("jeden");
        stos.push("dwa");
        stos.push("trzy");
        System.out.println(stos.size());
        System.out.println(stos.pop());
        System.out.println(stos.size());

        stos.push("czwarty");
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.size());

    }
}
