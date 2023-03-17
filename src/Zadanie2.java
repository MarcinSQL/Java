import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {

//        Komentarz z dzisiejsza data (17.03.2023r)

        Scanner klawisz = new Scanner(System.in);

        System.out.print("Imie: ");
        String firstName = klawisz.nextLine();

        System.out.print("Nazwisko: ");
        String lastName = klawisz.nextLine();

        System.out.print("Ulica: ");
        String street = klawisz.nextLine();

        System.out.print("Nr domu: ");
        String houseNum = klawisz.nextLine();

        System.out.print("Miasto: ");
        String cityName = klawisz.nextLine();

        System.out.print("Kod pocztowy: ");
        String postCode = klawisz.nextLine();

        System.out.print("Numer telefon: ");
        String phoneNum = klawisz.nextLine();

        System.out.println("Twoje imie to: " + firstName + ", twoje nazwisko to: " + lastName + "\nTwoja ulica to: " + street + ", nr domu: " + houseNum + "\nTwoja miasto to: " + cityName + ", kod pocztowy: " + postCode + "\nTwoj numer telefonu to: " + phoneNum);
    }
}
