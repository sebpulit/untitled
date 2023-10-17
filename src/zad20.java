import java.util.Scanner;

public class zad20 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj liczbe. : ");
        int liczba = klawiatura.nextInt();
        for (int   i=1; i<=liczba; i++) {
        for (int x=1;x<liczba;x++){
            System.out.print("X");
        }
            System.out.println("X");
        }

    }
}