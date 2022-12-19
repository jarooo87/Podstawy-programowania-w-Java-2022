public class GetSetMain {
    public static void main(String[] args) {
        GetSet uczen1 = new GetSet();
        //uczen1.student = "Kowalski";
        //uczen1.ocena = 5;
        //System.out.println(uczen1.ocena);
        uczen1.setStudent("Kowalski");
        System.out.println(uczen1.getStudent());
        uczen1.setStudent("A");
        System.out.println(uczen1.getStudent());
        uczen1.setOcena(3);
        System.out.println(uczen1.getOcena());
        uczen1.setOcena(0);
        System.out.println(uczen1.getOcena());
    }
}
