import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj dzien: ");
        int dzien = klawisz.nextInt();

        System.out.print("Podaj miesiac: ");
        int miesiac = klawisz.nextInt();

        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawisz.nextInt();

        if((dzien * miesiac) == rok) System.out.print("Data jest magiczna");
        else System.out.print("Magia nie jest posiadana w tym :C");
    }
}
