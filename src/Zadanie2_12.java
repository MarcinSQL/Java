import java.util.Scanner;

public class Zadanie2_12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj slowo kluczowe: ");
        String slowo = klawisz.nextLine();

        System.out.print("Podaj odleglosc: ");
        double odleglosc = klawisz.nextDouble();

        double czas;

        if(slowo.equals("powietrze")){
            czas = odleglosc/343;
            System.out.print("Czas z jakim pokonuje fala: " + czas);
        }
        else if(slowo.equals("woda")){
            czas = odleglosc/1490;
            System.out.print("Czas z jakim pokonuje fala: " + czas);
        }
        else if(slowo.equals("stal")){
            czas = odleglosc/5100;
            System.out.print("Czas z jakim pokonuje fala: " + czas);
        }
    }
}
