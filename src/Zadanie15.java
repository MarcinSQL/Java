import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj cene detaliczna: ");
        double cenaDetaliczna = klawisz.nextDouble();

        double zysk = cenaDetaliczna * 0.4;

        System.out.println("Zysk to: " + zysk);
    }
}
