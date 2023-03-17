import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int iloscKupionychAkcji = 600;
        double cenaJednejAkcji = 21.77;
        double cenaWszystkichAkcji = iloscKupionychAkcji * cenaJednejAkcji;
        double prowizja = cenaWszystkichAkcji * 0.02;
        double lacznaKwota = prowizja + cenaWszystkichAkcji;

        System.out.println("Kwota zaplacona za same akcje (bez prowizji): " + cenaWszystkichAkcji + "\nWysokosc prowizji: " + prowizja + "\nLaczna kwota do zaplaty: " + lacznaKwota);
    }
}
