public class ifStatement {
    public static void main(String[] args) {

        // instrukcje warunkowe if else

        if (2>1) {
            System.out.println(" PRAWDA");

        }
        if(5<1){
            System.out.println("PRAWDA");
        } else {
            System.out.println("FALSZ");
        }
        int  age = 18;
        if(age >= 18) {
            System.out.println(" Osoba dorosła");
        } else if (age>=16){
            System.out.println(" Osoba ma powyzej 16 lat");
        }else{
            System.out.println("Osoba nieletnia");
        }
        String name = age>=18 ? "JAN" : "MAREK";
        System.out.println(name);
    }
}
