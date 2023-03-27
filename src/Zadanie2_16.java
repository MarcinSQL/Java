import java.util.Scanner;

public class Zadanie2_16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj liczbe zakupionych ksiazek: ");
        int liczbaKsiazek = klawisz.nextInt();

        int punkty=0;

        if(liczbaKsiazek == 1) punkty = 5;
        else if(liczbaKsiazek == 2) punkty = 15;
        else if(liczbaKsiazek == 3) punkty = 30;
        else if(liczbaKsiazek >= 4) punkty = 60;
        System.out.print("Liczba punktow na koniec miesiaca: " + punkty);
    }
}
