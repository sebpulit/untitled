import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj imie i nazwisko.");

        do {
            System.out.print("Podaj swoją propozycję: ");
            zgadnietaLiczba = scanner.nextInt();
            proby++;

            if (zgadnietaLiczba < liczba) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else if (zgadnietaLiczba > liczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else {
                System.out.println("Brawo! Odgadłeś liczbę " + liczba + " w " + proby + " próbach.");
            }
        } while (zgadnietaLiczba != liczba);


    }
}