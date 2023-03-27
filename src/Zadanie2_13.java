import java.util.Scanner;

public class Zadanie2_13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Podaj litere pakietu: ");
        char literka = klawisz.next().charAt(0);

        System.out.print("Podaj liczbe minut rozmowy: ");
        int minuty = klawisz.nextInt();

        double cena=0,cenaOszczednosciowaB=0,cenaOszczednosciowaC=0;

        if(literka == 'A'){
            if(minuty >= 450){
                for(int i = 0; i<=(minuty - 450); i++) cena += 0.45;
                cena += 39.99;
                for(int i = 0; i<=(minuty - 900); i++) cenaOszczednosciowaB += 0.40;
                cenaOszczednosciowaB += 59.99;
                if(cena > cenaOszczednosciowaB || cena > 69.99){
                    System.out.println("Wybierajac pakiet B zaoszczedzisz: " + Math.round(cena - cenaOszczednosciowaB));
                    System.out.println("Wybierajac pakiet C zaoszczedzisz: " + Math.round(cena - 69.99));
                }
            }
            else cena = 39.99;
        }
        else if(literka == 'B'){
            if(minuty >= 900){
                for(int i = 0; i<=(minuty - 900); i++) cena += 0.40;
                cena += 59.99;
                if(cena > 69.99) System.out.println("Wybierajac pakiet C zaoszczedzisz: " + Math.round(cena - 69.99));
            }
            else cena = 59.99;
        }
        else if(literka == 'C'){
            cena = 69.99;
        }
        System.out.println("Oplata jest rowna: " + Math.round(cena));
    }
}
