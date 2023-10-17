import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nazwaPliku = "text.txt";

        System.out.print("Podaj znak do zliczenia: ");
        char szukanyZnak = scanner.next().charAt(0);

        int liczbaWystapien = 0;
        try (BufferedReader szukaj = new BufferedReader(new FileReader(nazwaPliku))) {
            int znak;
            while ((znak = szukaj.read()) != -1) {
                if ((char) znak == szukanyZnak) {
                    liczbaWystapien++;
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
            e.printStackTrace();
            return;
        }
        System.out.println("Liczba wystąpień znaku '" + szukanyZnak + "' w pliku: " + liczbaWystapien);
    }
}