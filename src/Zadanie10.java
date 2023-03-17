import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;

        Scanner klawisz = new Scanner(System.in);

        System.out.print("FirstName: ");
        firstName = klawisz.nextLine();

        System.out.print("MiddleName: ");
        middleName = klawisz.nextLine();

        System.out.print("LastName: ");
        lastName = klawisz.nextLine();

        char firstInitial, middleInitial, lastInitial;

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("FirstName:" + firstName + ", first letter: " + firstInitial + "\nMiddleName: " + middleName + ", first letter: " + middleInitial + "\nLastName: " + lastName + ", first letter: " + lastInitial);
    }
}
