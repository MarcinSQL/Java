import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Nazwa ulubionego miasta: ");
        String nazwaUlubionegoMiasta = klawisz.nextLine();

        int LiczbaZnakowWNazwieMiasta = nazwaUlubionegoMiasta.length();

        System.out.println("Ilosc znakow w nazwie miasta: " + LiczbaZnakowWNazwieMiasta);

        nazwaUlubionegoMiasta = nazwaUlubionegoMiasta.toUpperCase();

        System.out.println("Nazwa z duzych liter: " + nazwaUlubionegoMiasta);

        nazwaUlubionegoMiasta = nazwaUlubionegoMiasta.toLowerCase();

        System.out.println("Nazwa z malych liter: " + nazwaUlubionegoMiasta);
    }
}
