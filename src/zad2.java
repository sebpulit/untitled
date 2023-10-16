import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj szybkosc ");
        int szybkosc = klawiatura.nextInt();

        System.out.println("Podaj liczbe godzin ");
        int godzin = klawiatura.nextInt();

        for (int    i=1; i<=godzin; i++) {
            System.out.println(i + " " + szybkosc*i);
        }

    }
}