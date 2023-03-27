import java.util.Scanner;

public class Zadanie2_7 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj pierwsze imie: ");
        String imie1 = klawisz.nextLine();

        System.out.print("Podaj drugie imie: ");
        String imie2 = klawisz.nextLine();

        System.out.print("Podaj trzecie imie: ");
        String imie3 = klawisz.nextLine();

        if(imie1.compareToIgnoreCase(imie2) <= 0 && imie2.compareToIgnoreCase(imie3) <= 0) System.out.print(imie1 + " " + imie2 +  " " + imie3);
        else if(imie1.compareToIgnoreCase(imie3) <= 0 && imie3.compareToIgnoreCase(imie2) <= 0) System.out.print(imie1 + " " + imie3 +  " " + imie2);
        else if(imie2.compareToIgnoreCase(imie1) <= 0 && imie1.compareToIgnoreCase(imie3) <= 0) System.out.print(imie2 + " " + imie1 +  " " + imie3);
        else if(imie2.compareToIgnoreCase(imie3) <= 0 && imie3.compareToIgnoreCase(imie1) <= 0) System.out.print(imie2 + " " + imie3 +  " " + imie1);
        else if(imie3.compareToIgnoreCase(imie1) <= 0 && imie1.compareToIgnoreCase(imie2) <= 0) System.out.print(imie3 + " " + imie1 +  " " + imie2);
        else if(imie3.compareToIgnoreCase(imie2) <= 0 && imie2.compareToIgnoreCase(imie1) <= 0) System.out.print(imie3 + " " + imie2 +  " " + imie1);
    }
}
