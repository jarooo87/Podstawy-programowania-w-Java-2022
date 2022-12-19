public class ZmienneRzutowanieKonwersja {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        System.out.println(b);
        b = 5;
        short c = 10;
        int d = c;
        int e = 123;
        //short f = e;
        short f = (short)e;
        // rzutowanie jawne
        System.out.println(e);
        System.out.println(Short.MAX_VALUE);
        float g = 5.85f;
        //int h = g; rzutowanie nie jawne nie przejdzie
        int h = (int)g;
        System.out.println(g);
        //String number = h;
        //String number = (String)h;
        String number = Integer.toString(h);
        System.out.println(number);
        int i = Integer.parseInt(number);
        System.out.println(i + 2);
    }

}
