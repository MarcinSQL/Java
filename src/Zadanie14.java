import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        //Mozna to w tablicy ale za nic w swiecie mi sie nie chce tego robic

        int test1,test2,test3;

        System.out.print("Podaj wynik pierwszego testu: ");
        test1 = klawisz.nextInt();
        int i=1;

        System.out.print("Podaj wynik drugiego testu: ");
        test2 = klawisz.nextInt();
        i++;

        System.out.print("Podaj wynik trzeciego testu: ");
        test3 = klawisz.nextInt();
        i++;

        double srednia = (test1 + test2 + test3)/i;

        System.out.println("Wynik pierwszego testu: " + test1 + "\nWynik drugiego testu: " + test2 + "\nWynik trzeciego testu: " + test3 + "\nSrednia arytmetyczna tych testow to: " + srednia);
    }
}
