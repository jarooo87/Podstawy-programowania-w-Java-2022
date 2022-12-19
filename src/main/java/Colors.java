
public class Colors implements Comparable<Colors>{
   String name;
   int numberOfColors =5;

   public Colors(String name){
       this.name=name;
   }
    // @Override oznacza iz nadpisujemy metode glowna z klasy Comparable
   // @Override
   // public int compareTo(Colors o) {
     //   return this.name.compareTo(o.name);
   // }
// tworzymy metode ktora jako pierwsze porowna nam obiekty alfabetycznie a pozniej
    // ustawi nam obiekty z roznym numberOfColors od najmniejszej wartosci
    @Override
    public int compareTo(Colors o) {
        if(this.name.compareTo(o.name)!=0){
            return this.name.compareTo(o.name);
            // to ustawia nam alfabetycznie liste
        }
        return this.numberOfColors - o.numberOfColors;
        // to ustawia nam ilosc kolorow od najmniejszej
    }
}
