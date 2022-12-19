public class MainEquals {
    public static void main(String[] args) {
        Equals e1 = new Equals();
        Equals e2 = new Equals();
        e1.name = "Marek";
        e2.name = "Marek";
        System.out.println(1 == 1);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
