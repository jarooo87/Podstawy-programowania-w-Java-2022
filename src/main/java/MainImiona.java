public class MainImiona {
    public static void main(String[] args) {
        Andrzej osoba1 = new Andrzej();
        osoba1.liczbaOsob();
        System.out.println(osoba1.toString());

        //Robert osoba3 = new Imiona();
        osoba1.nazwisko();
        /*
        ((Robert)osoba2).nazwisko();
        //((Andrzej)osoba2).nazwisko();
        System.out.println(osoba2 instanceof  Andrzej);
        if (osoba2 instanceof Andrzej){
            ((Andrzej)osoba2).nazwisko();
        }
        if(osoba2 instanceof Robert){
            ((Robert)osoba2).nazwisko();
        }
        System.out.println(osoba2 instanceof Imiona);

        try{
            ((Andrzej)osoba2).nazwisko();
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("ZAWSZE WYPALI");
        }

         */
        System.out.println("LINIJKA PO BLEDZIE");
        try{
            Imiona osoba2 = new Robert("");
            osoba2.liczbaOsob();
            ((Robert)osoba2).nazwisko();
            int a = 3/0;
        }catch(ClassCastException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println("BLAD MATEMATYCZNY");
        }catch(Exception e){
            System.out.println("Blad kazdego rodzaju");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("ZAWSZE WYPALI");
        }
    }
}
