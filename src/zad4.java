import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj ilosc dni ");
        double dni = klawiatura.nextDouble();
        double x =1;

        for (int i=1; i<=dni; i++)
        {
            System.out.println(i + " dzien " + x/100 + " zł");
            x=x*2;
        }

    }
}