import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        String name ;
        int age;
        double annualPay;

        Scanner klawisz = new Scanner(System.in);

        System.out.print("Nazwisko: ");
        name = klawisz.nextLine();

        System.out.print("Wiek: ");
        age = klawisz.nextInt();

        System.out.print("Oczekiwany roczny dochod: ");
        annualPay = klawisz.nextDouble();

        System.out.println("Nazywam sie " + name + ", mam " + age + " lat " + "\ni chce zarabiac " + annualPay + " zlotych rocznie");
    }
}
