import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku: ");
        String nazwaPliku = scanner.nextLine();

        try (BufferedReader sprawdzanie = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;

            while ((linia = sprawdzanie.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

