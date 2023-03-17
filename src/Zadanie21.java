import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double iloscLat;
        double iloscOdsetekNaRok;
        double rocznaStopkaOprocentowania;
        double kwotaPierwotna;

        System.out.print("Kwota pieniedzy poczatkowo zdeponowanej na konto: ");
        kwotaPierwotna = klawisz.nextDouble();

        System.out.print("Ilosc odsetek na rok: ");
        iloscOdsetekNaRok = klawisz.nextDouble();

        System.out.print("Roczna stopka oprocentowania: ");
        rocznaStopkaOprocentowania = klawisz.nextDouble();

        System.out.print("Ilosc lat: ");
        iloscLat = klawisz.nextDouble();

        double kwotaPieniedzyPoOkreslonejLiczbieLat = kwotaPierwotna * Math.pow((1 + rocznaStopkaOprocentowania / iloscOdsetekNaRok), (iloscOdsetekNaRok * iloscLat));

        System.out.println("Kwota koncowa: " + kwotaPieniedzyPoOkreslonejLiczbieLat);
    }
}
