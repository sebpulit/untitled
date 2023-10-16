import java.util.Scanner;

public class zad12 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 1 ");
        double sklep1 = klawiatura.nextDouble();
        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 2 ");
        double sklep2 = klawiatura.nextDouble();
        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 3 ");
        double sklep3 = klawiatura.nextDouble();
        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 4 ");
        double sklep4 = klawiatura.nextDouble();
        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 5 ");
        double sklep5 = klawiatura.nextDouble();

        System.out.print("Sklep nr 1: ");
        for (int i=1; i<=sklep1/100; i++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        System.out.print("Sklep nr 2: ");
        for (int i=1; i<=sklep2/100; i++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        System.out.print("Sklep nr 3: ");
        for (int i=1; i<=sklep3/100; i++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        System.out.print("Sklep nr 4: ");
        for (int i=1; i<=sklep4/100; i++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        System.out.print("Sklep nr 5: ");
        for (int i=1; i<=sklep5/100; i++)
        {
            System.out.print(" *");
        }

    }
}