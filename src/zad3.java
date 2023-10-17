import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szybkość pojazdu : ");
        int szybkosc = scanner.nextInt();


        System.out.print("Podaj liczbę godzin podróży: ");
        int liczbaGodzin = scanner.nextInt();


        String nazwaPliku = "odleglosc_pojazdu.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku));

        for (int godzina = 1; godzina <= liczbaGodzin; godzina++) {
            int odleglosc = szybkosc * godzina;
            writer.write(godzina + "\t" + odleglosc + "\n");
        }
        if (writer != null) {
            writer.close();
        }
    }
}
