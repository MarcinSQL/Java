import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj cene posilku: ");
        double cenaPosilku = klawisz.nextDouble();

        double podatek = 0.0675;
        double napiwek = (cenaPosilku + podatek) * 0.20;
        double kwotaDoZaplaty = cenaPosilku + (cenaPosilku * podatek) + napiwek;

        System.out.println("Cena posilku: " + cenaPosilku + "\nWartosc podatku: " + podatek + "\nWysokosc napiwku: " + napiwek + "\nKwota do zaplaty: " + kwotaDoZaplaty);
    }
}
