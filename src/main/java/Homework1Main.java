public class Homework1Main extends Homework1{
    @Override
    public int metoda(int a, int b, int c) {
        return (a+b +c);
    }

    public static void main(String[] args) {
        Homework1Main a = new Homework1Main();
        System.out.println(a.metoda(1,2, 3));
    }
}

