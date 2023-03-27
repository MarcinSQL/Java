import java.util.Scanner;

public class Zadanie2_9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj wage: ");
        double waga = klawisz.nextDouble();

        System.out.print("Podaj odleglosc(km): ");
        double km = klawisz.nextDouble();

        double koszt = 0;

        if(km > 500) koszt = 2.20;

        if(waga <= 1) koszt += 1.10;
        else if(waga > 1 && waga <= 3) koszt += 2.20;
        else if(waga > 3 && waga <= 5) koszt += 3.70;
        else koszt += 3.80;
        System.out.print("Koszt przesylki: " + koszt);
    }
}
