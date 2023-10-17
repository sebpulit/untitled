import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków: ");
        String lancuch = scanner.nextLine();

        System.out.print("Podaj znak do zliczenia: ");
        char znak = scanner.next().charAt(0);

        int x = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) == znak) {
                x++;
            }
        }
        System.out.println("Liczba wystąpień znaku '" + znak + "' w łańcuchu: " + x);
    }
}