import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double cenaProduktu;

        System.out.print("Podaj cene produktu: ");
        cenaProduktu = klawisz.nextDouble();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double cenaProduktuZPodatkiem = cenaProduktu + (cenaProduktu * podatekLokalny) + (cenaProduktu *  podatekStanowy);

        System.out.println("Wartosc produktu: " + cenaProduktu + "\nPodatek stanowy: " + podatekStanowy + "\nPodatek lokalny: " + podatekLokalny + "\nLaczna cena sprzedazy: " + cenaProduktuZPodatkiem);
    }
}
