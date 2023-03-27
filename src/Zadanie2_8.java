import java.util.Scanner;

public class Zadanie2_8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int cena = 99, ilosc;
        double rabat, kosztZakupu;

        System.out.print("Podaj ilosc: ");
        ilosc = klawisz.nextInt();

        if(ilosc >= 10 && ilosc < 20){
            rabat = 0.2;
            kosztZakupu = cena * ilosc;
            kosztZakupu = kosztZakupu - kosztZakupu * rabat;
            System.out.print("Rabat wynosi: " + rabat * 100 + "%, a laczna kwota do zaplaty to: " + kosztZakupu);
        }
        else if(ilosc >= 20 && ilosc < 50){
            rabat = 0.3;
            kosztZakupu = cena * ilosc;
            kosztZakupu = kosztZakupu - kosztZakupu * rabat;
            System.out.print("Rabat wynosi: " + rabat * 100 + "%, a laczna kwota do zaplaty to: " + kosztZakupu);
        }
        else if(ilosc >= 50 && ilosc < 100){
            rabat = 0.4;
            kosztZakupu = cena * ilosc;
            kosztZakupu = kosztZakupu - kosztZakupu * rabat;
            System.out.print("Rabat wynosi: " + rabat * 100 + "%, a laczna kwota do zaplaty to: " + kosztZakupu);
        }
        else if(ilosc >= 100){
            rabat = 0.5;
            kosztZakupu = cena * ilosc;
            kosztZakupu = kosztZakupu - kosztZakupu * rabat;
            System.out.print("Rabat wynosi: " + rabat * 100 + "%, a laczna kwota do zaplaty to: " + kosztZakupu);
        }
        else{
            rabat = 0;
            kosztZakupu = cena * ilosc;
            System.out.print("Rabat wynosi: " + rabat * 100 + "%, a laczna kwota do zaplaty to: " + kosztZakupu);
        }
    }
}
