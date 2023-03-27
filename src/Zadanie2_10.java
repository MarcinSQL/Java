import java.util.Scanner;

public class Zadanie2_10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj liczbe kalorii: ");
        int kalorie = klawisz.nextInt();

        System.out.print("Podaj gramy tluszczu: ");
        double tluszcz = klawisz.nextDouble();

        double kalorieZTluszczu = tluszcz * 9;

        if(kalorieZTluszczu/kalorie <0.3)System.out.print("Produkt jest niskotluszczowy");
        else if(kalorieZTluszczu/kalorie > 1)System.out.print("Zle podane informacje");
    }
}
