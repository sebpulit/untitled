import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj dodatna niezerowa liczbe całkowita. : ");
            int ilosc = klawiatura.nextInt();
            int suma = 0;
            for (int    i=1; i<=ilosc; i++) {

                suma = suma + i;
            }

        System.out.println(suma);


    }
}