public class StringOptimalization {
    public static void main(String[] args) {
        String a = "";
        long timeElapsed = System.currentTimeMillis();
        for(int i =0; i<10000;i++){
            a += "b";
        }
        System.out.println(a);
        System.out.println("Czas jaki uplynal : " + (System.currentTimeMillis() - timeElapsed));
       // b, bb, bbb, bbbb
        // bbbbbbbbbbbbb
        StringBuilder mojString = new StringBuilder();
        timeElapsed = System.currentTimeMillis();
        for(int i =0; i<10000;i++){
            mojString.append("b");
        }
        System.out.println(mojString.toString());
        System.out.println("Czas jaki uplynal : " + (System.currentTimeMillis() - timeElapsed));
    }
}
