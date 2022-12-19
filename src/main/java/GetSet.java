public class GetSet {
    // gettery settery, hermetyzacja danych(enkapsulacja)
    // gettery i settery sa metodami pozwalajacymi na pobranie
    // lub zmiane wartosci prywatnego pola z klasy zewnetrznej
    // enkapsulacja pozwala ograniczyc dostep do danych

   // String student;
   // int ocena;
    private String student;

    String getStudent(){
        return "Nazwisko " + this.student;
    }
    void setStudent(String student){
        if(student.length() >=2){
            this.student=student;
        }
    }
    private int ocena;
    int getOcena(){
        return this.ocena;
    }
    void setOcena(int ocena){
        if(ocena >=1 && ocena<=6){
            this.ocena=ocena;
        }
    }




}
