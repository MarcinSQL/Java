import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double przejechaneKilometry, zuzyciePaliwa;

        System.out.print("Podaj przejechane kilometry: ");
        przejechaneKilometry = klawisz.nextDouble();

        System.out.print("Podaj zuzyte paliwo: ");
        zuzyciePaliwa = klawisz.nextDouble();

        double kilometryNaLitrze = przejechaneKilometry / zuzyciePaliwa;

        System.out.println("Kilometry na litrze " + kilometryNaLitrze);
    }
}
