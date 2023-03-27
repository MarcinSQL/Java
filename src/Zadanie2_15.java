import java.util.Scanner;

public class Zadanie2_15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj liczbe czekow: ");
        int liczbaCzekow = klawisz.nextInt();

        double cena=10;

        if(liczbaCzekow < 20){
            for(int i=0; i<liczbaCzekow; i++) cena +=0.10;
        }
        else if(liczbaCzekow >= 20 && liczbaCzekow < 40){
            for(int i=0; i<liczbaCzekow; i++) cena +=0.08;
        }
        else if(liczbaCzekow >= 40 && liczbaCzekow < 60){
            for(int i=0; i<liczbaCzekow; i++) cena +=0.06;
        }
        else if(liczbaCzekow >= 60){
            for(int i=0; i<liczbaCzekow; i++) cena +=0.04;
        }
        System.out.print("Kwota do zaplaty: " + Math.round(cena));
    }
}
