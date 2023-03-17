import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Dlugosc rzedu: ");
        double dlugoscRzedu = klawisz.nextDouble();

        System.out.print("Ilosc miejsca dla okratowania: ");
        double iloscMiejscaDlaOkratowania= klawisz.nextDouble();

        System.out.print("Odleglosc miedzy sadzonkami: ");
        double odlegloscMiedzySadzonkami = klawisz.nextDouble();

        double liczbaSadzonek = (dlugoscRzedu - 2*iloscMiejscaDlaOkratowania) / odlegloscMiedzySadzonkami;

        System.out.println("Liczba sadzonek: " + liczbaSadzonek);

    }
}
