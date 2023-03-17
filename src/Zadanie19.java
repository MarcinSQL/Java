import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int iloscKonsumentow = 12467;
        double iloscOsobKupujacychEnergoleTygodoniowo = (double)iloscKonsumentow * 0.14;
        double iloscCytryniarze = iloscOsobKupujacychEnergoleTygodoniowo * 0.64;

        System.out.println("Ilosc osob ktore kupuja energole: " + iloscOsobKupujacychEnergoleTygodoniowo + "\nIlosc cytryniarzy co kupuja energole cytrynowe: " + iloscCytryniarze);
    }
}
