import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int iloscCiasteczek = 48;
        double iloscCukru = 1.5 / iloscCiasteczek;
        double iloscMasla = 1 / iloscCiasteczek;
        double iloscMaki = 2.75 / iloscCiasteczek;

        System.out.print("Podaj liczbe ciasteczek: ");
        double iloscPodanychCiasteczek = klawisz.nextDouble();

        iloscCukru = iloscCukru * iloscPodanychCiasteczek;
        iloscMasla= iloscMasla * iloscPodanychCiasteczek;
        iloscMaki = iloscMaki * iloscPodanychCiasteczek;

        System.out.println("Ilosc cukru: " + iloscCukru + "\nIlosc masla: " + iloscMasla + "\nIlosc maki: " + iloscMaki);
    }
}
