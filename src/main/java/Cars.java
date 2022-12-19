public class Cars {
    static int liczbaAut = 0;
    Cars(){
        liczbaAut++;
    }
    String nazwa;
    String model;

    public void jakaNazwa(){
        System.out.println(" Nazwa auta to :" + nazwa);
    }
    public void jakiModel(){
        System.out.println(" Model auta to : " + model);
    }
}
