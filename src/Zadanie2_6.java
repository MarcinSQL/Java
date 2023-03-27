import java.util.Scanner;

public class Zadanie2_6 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj liczbe sekund: ");
        int sekundy = klawisz.nextInt();

        if(sekundy > 60 && sekundy <= 3600){
            int minuty = sekundy/60;
            int sekundyPoZmianie = sekundy - minuty * 60;
            System.out.print(sekundy + " sekund to " + minuty + " minut " + sekundyPoZmianie + " seknud ");
        }
        else if(sekundy > 3600 && sekundy <= 86400){
            int minuty = sekundy/60;
            int godziny = minuty/60;
            int sekundyPoZmianie = sekundy - minuty * 60;
            int minutyPoZmianie = minuty - godziny * 60;
            System.out.print(sekundy + " sekund to "+ godziny + " godzin " + minutyPoZmianie + " minut " + sekundyPoZmianie + " seknud ");
        }
        else if(sekundy > 86400){
            int minuty = sekundy/60;
            int godziny = minuty/60;
            int dni = godziny/24;
            int sekundyPoZmianie = sekundy - minuty * 60;
            int minutyPoZmianie = minuty - godziny * 60;
            int godzinyPoZmianie = godziny - dni * 24;;
            System.out.print(sekundy + " sekund to "+ dni + " dni " + godzinyPoZmianie + " godzin " + minutyPoZmianie + " minut " + sekundyPoZmianie + " seknud ");
        }
    }
}
