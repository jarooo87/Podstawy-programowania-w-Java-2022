public class PojazdMain {
    public static void main(String[] args) {
        Pojazd autobus = new Pojazd(1999,5);
        Pojazd autoSportowe = new Pojazd(2020,3);

        autobus.liczbaPasazerow = 40;
        autobus.pojemnoscZbiornika = 100;
        autobus.kmNaSto = 15;

        autoSportowe.liczbaPasazerow = 4;
        autoSportowe.pojemnoscZbiornika = 50;
        autoSportowe.kmNaSto = 10;
        System.out.println("Autobus przewozi " + autobus.liczbaPasazerow + " osób");
        autobus.zasieg();
        System.out.println("autoSportowe przewozi " + autoSportowe.liczbaPasazerow + " osób");
        autoSportowe.zasieg();

        int zasieg1, zasieg2;
        zasieg1 = autobus.zasieg();
        zasieg2 = autoSportowe.zasieg();
        System.out.println("Zasieg autobusu to: "+ zasieg1);
        System.out.println("Zasieg autaSportowego to: " + zasieg2);
    }
}
