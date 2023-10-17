import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj początkową liczbę organizmów: ");
        int poczatkowa = scanner.nextInt();

        System.out.print("Podaj średni dzienny przyrost populacji (w procentach): ");
        double Przyrost = scanner.nextDouble();

        System.out.print("Podaj liczbę dni rozmnażania: ");
        int liczbaDniRozmnazania = scanner.nextInt();

        System.out.print("Dzień ");
        System.out.println(" Wielkość populacji");

        double wielkoscPopulacji = poczatkowa;
        for (int dzien = 1; dzien <= liczbaDniRozmnazania; dzien++) {
            System.out.println(dzien + "\t\t" + (int)wielkoscPopulacji);

            wielkoscPopulacji = wielkoscPopulacji* (1 + Przyrost / 100);
        }


    }
}
