public class Pojazd {
    int liczbaPasazerow;
    int pojemnoscZbiornika;
    double kmNaSto; // spalanie na 100
    int rokProdukcji;
    int liczbaDrzwi;
    // dodajemy konstruktor do klasy
    Pojazd(int a, int b){
        rokProdukcji = a;
        liczbaDrzwi = b;
    }

    // metoda void nic nie zwraca
   // public void zasieg(){
        //System.out.println("Zasieg pojazdu na 100km :" +(int) (pojemnoscZbiornika/ kmNaSto * 100));
   // }
    public int zasieg(){
        return (int) (pojemnoscZbiornika/ kmNaSto * 100);
    }


    }


