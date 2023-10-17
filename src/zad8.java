import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę lat: ");
        int liczbaLat = scanner.nextInt();

        while (liczbaLat < 1) {
            System.out.println("Liczba lat nie może być mniejsza niż 1. Podaj poprawną liczbę lat: ");
            liczbaLat = scanner.nextInt();
        }

        double sumaOpadow = 0;

        for (int rok = 1; rok <= liczbaLat; rok++) {
            for (int miesiac = 1; miesiac <= 12; miesiac++) {
                System.out.print("Podaj ilość opadów mniesiaca " + miesiac + " roku " + rok + ": ");
                double iloscOpadow = scanner.nextDouble();


                sumaOpadow += iloscOpadow;
            }
        }

        int liczbaMiesiecy = liczbaLat * 12;
        double sredniPoziomOpadow = sumaOpadow / liczbaMiesiecy;

        System.out.println("Liczba miesięcy: " + liczbaMiesiecy);
        System.out.println("Łączna ilość opadów: " + sumaOpadow );
        System.out.println("Średni poziom opadów: " + sredniPoziomOpadow);}
}
