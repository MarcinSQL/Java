import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Waga: ");
        double waga = klawisz.nextDouble();

        System.out.print("Wzrost: ");
        double wzrost = klawisz.nextDouble();

        double bmi = waga/(wzrost*wzrost);

        if(bmi >= 18.5 && bmi <= 25) System.out.print("Wszystko jest ok");
        else if(bmi > 25) System.out.print("Schudnij");
        else  System.out.print("Przytyj");
    }
}
