import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;


public class FileWriterReader {
    public static void main(String[] args) {
        File f = new File("mojPlik.txt");

        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("File created");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (f.canWrite()) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                Formatter fm = new Formatter(bw);
                Scanner skanerZKonsoli = new Scanner(System.in);
                Scanner skanerZPliku = new Scanner(f);
                System.out.println("Wpisz tekst do zapisu");
                String tekstWczytany = skanerZKonsoli.nextLine();
                fm.format("%s \r\n",tekstWczytany);
                System.out.println("Plik zapisany");
                fm.close();
                bw.close();
                System.out.println("To jest w naszym pliku");
                while (skanerZPliku.hasNextLine()){
                    System.out.println(skanerZPliku.nextLine());
                }
                skanerZKonsoli.close();
                skanerZPliku.close();


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
