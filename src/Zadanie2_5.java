import java.util.Scanner;

public class Zadanie2_5 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Masa obiektu: ");
        double masa = klawisz.nextDouble();

        double ciezar = masa * 9.8;

        if(ciezar > 1000)System.out.print("Obiekt jest zbyt ciezki");
        else if(ciezar < 10)System.out.print("Obiekt jest zbyt lekki");
    }
}
