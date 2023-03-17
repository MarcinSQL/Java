import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
    int pierwszePomieszczenie = 2 * 2;
    int drugiePomieszczenie = 2 * 3;
    int trzeciePomieszczenie = 3 * 4;
    int czwartePomieszczenie = 3 * 4;

    int mieszkanie = pierwszePomieszczenie + drugiePomieszczenie + trzeciePomieszczenie + czwartePomieszczenie;
    int iloscOsob = 4;

    double mieszkanieNaJednaOsobe = mieszkanie / iloscOsob;

        System.out.println("Powierzchnia pierwszego pomieszczenia: " + pierwszePomieszczenie + "\nPowierzchnia drugiego pomieszczenia: " + drugiePomieszczenie + "\nPowierzchnia trzeciego pomieszczenia: " + trzeciePomieszczenie + "\nPowierzchnia czwartego pomieszczenia:" + czwartePomieszczenie + "\nPowierzchnia calego mieszkania: " + mieszkanie + "\nIlosc osob: " + iloscOsob + "\nPowierzchnia mieszkania na jedna osobe: " + mieszkanieNaJednaOsobe);

    }
}
