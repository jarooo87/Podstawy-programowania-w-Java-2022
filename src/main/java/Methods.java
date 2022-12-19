public class Methods {
    public static void main(String[] args){
        method();
        method2();
        System.out.println(method2());
        String a = method2();
        System.out.println(a);
        System.out.println(plus());
        System.out.println(plus(10));
        System.out.println(plus(1,7));

    }
    static void method(){
        System.out.println(" Hello World");
    }
    static String method2(){
        return "Hello World";
    }
    // przeciazanie metod(funkcji)
    static int plus(){
        return 0;
    }
    static int plus(int a){
        return a +1;
    }
    static int plus(int a, int b){
        return  a+b;
    }
}
