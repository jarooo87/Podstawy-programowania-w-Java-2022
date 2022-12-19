public class MainColors {
    public static void main(String[] args) {
        Lights trafficLights = new Lights("drive",Colors.GREEN);

        switch(trafficLights.kolor){
            case GREEN -> System.out.println("GO");
            case YELLOW -> System.out.println("READY TO GO");
            case RED -> System.out.println("STOP");

        }
    }
}
