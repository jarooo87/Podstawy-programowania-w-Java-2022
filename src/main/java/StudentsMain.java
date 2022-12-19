import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentsMain {
    public static void main(String[] args) {
        ArrayList<Students> peoples = new ArrayList<>();
        Students s1 = new Students("Sylwek",18);
        Students s2 = new Students("Marek", 24);
        Students s3 = new Students("Rafal", 32);
        Students s4 = new Students("Dawid", 20);
        Students s5 = new Students("Dawid", 33);

        peoples.add(s1);
        peoples.add(s2);
        peoples.add(s3);
        peoples.add(s4);
        peoples.add(s5);

        System.out.println(peoples);
        Collections.sort(peoples);
        System.out.println("------");
        System.out.println(peoples);
        System.out.println("-------");
        peoples.sort(Comparator.comparingInt(Students::getAge));
        System.out.println("Lista posortowana wiekiem " + peoples);
        Collections.sort(peoples, Collections.reverseOrder());
        System.out.println(peoples);

        }
    }

