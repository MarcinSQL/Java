import java.util.Scanner;

public class Zadanie2_11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        String[] nazwiska = new String[3];
        double[] czas = new double[3];

        System.out.print("Podaj nazwisko 1 biegacza: ");
        nazwiska[0] = klawisz.nextLine();

        System.out.print("Podaj czas 1 biegacza(min): ");
        czas[0] = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Podaj nazwisko 2 biegacza: ");
        nazwiska[1] = klawisz.nextLine();

        System.out.print("Podaj czas 2 biegacza(min): ");
        czas[1] = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.print("Podaj nazwisko 3 biegacza: ");
        nazwiska[2] = klawisz.nextLine();

        System.out.print("Podaj czas 3 biegacza(min): ");
        czas[2] = klawisz.nextDouble();

        if(czas[0] <= czas[1] && czas[1] <= czas[2])System.out.print(nazwiska[0] + " " + nazwiska[1] + " " + nazwiska[2]);
        else if(czas[0] <= czas[2] && czas[2] <= czas[1])System.out.print(nazwiska[0] + " " + nazwiska[2] + " " + nazwiska[1]);
        else if(czas[1] <= czas[0] && czas[0] <= czas[2])System.out.print(nazwiska[1] + " " + nazwiska[0] + " " + nazwiska[2]);
        else if(czas[1] <= czas[2] && czas[3] <= czas[0])System.out.print(nazwiska[1] + " " + nazwiska[2] + " " + nazwiska[0]);
        else if(czas[2] <= czas[0] && czas[0] <= czas[1])System.out.print(nazwiska[2] + " " + nazwiska[0] + " " + nazwiska[1]);
        else if(czas[2] <= czas[1] && czas[1] <= czas[0])System.out.print(nazwiska[2] + " " + nazwiska[1] + " " + nazwiska[0]);

    }
}
