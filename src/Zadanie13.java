import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int iloscCiasteczekWPudelku = 40;
        int iloscKaloriiNaPorcje = 300;
        int iloscPorcjiWOpakowaniu = 10;
        int iloscCiasteczekNaPorcje = iloscCiasteczekWPudelku / iloscPorcjiWOpakowaniu;
        int iloscZjedzonychCiasteczek;
        double iloscKaloriiNaCiasteczko = (double)iloscKaloriiNaPorcje / (double)iloscCiasteczekNaPorcje;

        System.out.print("Podaj ilosc zjedzonych ciasteczek: ");
        iloscZjedzonychCiasteczek = klawisz.nextInt();

        int iloscZjedzonychKalorii = iloscZjedzonychCiasteczek * (int)iloscKaloriiNaCiasteczko;

        System.out.println("Ilosc zjedzonych kalorii: " + iloscZjedzonychKalorii);
    }
}
