import java.util.Scanner;
public class Zadanie8 {
        public static void main(String[] args) {
            Scanner klawisz = new Scanner(System.in);

            System.out.print("Dlugosc pokoju nr1: ");
            int dlugoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            System.out.print("Szerokosc pokoju nr1: ");
            int szerokoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            int pierwszePomieszczenie = dlugoscPokoju * szerokoscPokoju;

            System.out.print("Dlugosc pokoju nr2: ");
            dlugoscPokoju = dlugoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            System.out.print("Szerokosc pokoju nr2: ");
            szerokoscPokoju =szerokoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            int drugiePomieszczenie = dlugoscPokoju * szerokoscPokoju;

            System.out.print("Dlugosc pokoju nr3: ");
            dlugoscPokoju = dlugoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            System.out.print("Szerokosc pokoju nr3: ");
            szerokoscPokoju =szerokoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            int trzeciePomieszczenie = szerokoscPokoju * dlugoscPokoju;

            System.out.print("Dlugosc pokoju nr4: ");
            dlugoscPokoju = dlugoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            System.out.print("Szerokosc pokoju nr4: ");
            szerokoscPokoju =szerokoscPokoju = klawisz.nextInt();
            klawisz.nextLine();

            int czwartePomieszczenie = szerokoscPokoju * dlugoscPokoju;

            int mieszkanie = pierwszePomieszczenie + drugiePomieszczenie + trzeciePomieszczenie + czwartePomieszczenie;
            int iloscOsob = 4;

            double mieszkanieNaJednaOsobe = (double)mieszkanie / (double)iloscOsob;

            System.out.println("Powierzchnia pierwszego pomieszczenia: " + pierwszePomieszczenie + "\nPowierzchnia drugiego pomieszczenia: " + drugiePomieszczenie + "\nPowierzchnia trzeciego pomieszczenia: " + trzeciePomieszczenie + "\nPowierzchnia czwartego pomieszczenia:" + czwartePomieszczenie + "\nPowierzchnia calego mieszkania: " + mieszkanie + "\nIlosc osob: " + iloscOsob + "\nPowierzchnia mieszkania na jedna osobe: " + mieszkanieNaJednaOsobe);

        }
    }
