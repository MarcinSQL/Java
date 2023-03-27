import java.util.Scanner;

public class Zadanie2_1 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        String[] rzymskie = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        System.out.print("Wpisz liczbe od 1 do 10: ");
        int liczba = klawisz.nextInt();

        if(liczba == 1)  System.out.print("Rzymska to: " + rzymskie[0]);
        else if(liczba == 2)  System.out.print("Rzymska to: " + rzymskie[1]);
        else if(liczba == 3)  System.out.print("Rzymska to: " + rzymskie[2]);
        else if(liczba == 4)  System.out.print("Rzymska to: " + rzymskie[3]);
        else if(liczba == 5)  System.out.print("Rzymska to: " + rzymskie[4]);
        else if(liczba == 6)  System.out.print("Rzymska to: " + rzymskie[5]);
        else if(liczba == 7)  System.out.print("Rzymska to: " + rzymskie[6]);
        else if(liczba == 8)  System.out.print("Rzymska to: " + rzymskie[7]);
        else if(liczba == 9)  System.out.print("Rzymska to: " + rzymskie[8]);
        else if(liczba == 10)  System.out.print("Rzymska to: " + rzymskie[9]);
        else System.out.print("Podales liczbe z poza przedzialu");



    }
}
