import java.util.Scanner;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Ocena test 1: ");
        double test1 = klawisz.nextDouble();

        System.out.print("Ocena test 2: ");
        double test2 = klawisz.nextDouble();

        System.out.print("Ocena test 3: ");
        double test3 = klawisz.nextDouble();

        double srednia = (test1 + test2 + test3)/3;

        if(srednia >= 90)System.out.print("Ocena 5");
        else if(srednia >= 80)System.out.print("Ocena 4");
        else if(srednia >= 70)System.out.print("Ocena 3");
        else if(srednia >= 60)System.out.print("Ocena 2");
        else System.out.print("Ocena 1");
    }
}
