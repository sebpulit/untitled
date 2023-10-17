import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę pięter w hotelu: ");
        int liczbaPieter = scanner.nextInt();

        int lacznaLiczbaPokoi = 0;
        int lacznaLiczbaZajetychPokoi = 0;

        for (int i = 1; i <= liczbaPieter; i++) {
            System.out.print("Podaj liczbę pokojów na " + i + " piętrze: ");
            int liczbaPokoiNaPietrze = scanner.nextInt();

            System.out.print("Podaj liczbę zajętych pokojów na " + i + " piętrze: ");
            int liczbaZajetychPokoi = scanner.nextInt();

            lacznaLiczbaPokoi += liczbaPokoiNaPietrze;
            lacznaLiczbaZajetychPokoi += liczbaZajetychPokoi;
        }

        double poziomOblozenia = (double) lacznaLiczbaZajetychPokoi / lacznaLiczbaPokoi;

        System.out.println("Łączna liczba pokoi w hotelu: " + lacznaLiczbaPokoi);
        System.out.println("Liczba zajętych pokoi: " + lacznaLiczbaZajetychPokoi);
        System.out.println("Liczba pustych pokoi: " + (lacznaLiczbaPokoi - lacznaLiczbaZajetychPokoi));
        System.out.println("Poziom obłożenia: " + (poziomOblozenia * 100) + "%");
    }
}
