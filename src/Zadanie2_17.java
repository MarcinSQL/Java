import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2_17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

//        boolean wegeterianskie,weganskie,bezglutenowe;

//        boolean[] LuksusoweBurgeryUJarka = {false,false,false};
//        boolean[] PizzeriaPrzyDworcowej = {true,false,true};
//        boolean[] KawiarniaNaRogu = {true,true,true};
//        boolean[] WloskieSpecjaly = {true,false,false};
//        boolean[] KuchniaUSzefa = {true,true,true};

//        String[] restauracje = {"Luksusowe Burgery u Jarka", "Pizzeria przy Dworcowej", "Kawiarnia na Rogu", "Wloskie Specjaly", "Kuchnia u Szefa"};
//
//        System.out.print("Czy ktoras z osob jest na diecie wegeterianskiej?");
//        String dietaWegeterianska = klawisz.next();
//
//        int j=0;
//
//        if(dietaWegeterianska.equals("tak")){
//            String[] copy = new String[restauracje.length - 1];
//            for(int i=0; i < copy.length; i++){
//                if(j != 0)  copy[i] = restauracje[j];
//                j++;
//            }
//            System.out.print("Propozycje resturacji: ");
//            for(int element=0; element <= copy.length; element++){
//                System.out.println(copy[element]);
//            }
//        };
//
        System.out.print("Czy ktoras z osob jest na diecie wegeterianskiej?");
        String dietaWegeterianska = klawisz.next();

        System.out.print("Czy ktoras z osob jest na diecie weganskiej?");
        String dietaWeganska = klawisz.next();

        System.out.print("Czy ktoras z osob jest na diecie bezglutenowej?");
        String dietaBezglutenowa = klawisz.next();

        System.out.println("Propozycje restauracji: ");
        if(dietaWegeterianska.equals("nie") && dietaWeganska.equals("nie") && dietaBezglutenowa.equals("nie")) System.out.println("Luksusowe Burgery u Jarka");
        if(dietaWegeterianska.equals("tak") && dietaWeganska.equals("nie") && dietaBezglutenowa.equals("tak")) System.out.println("Pizzeria przy Dworcowej");
        if(dietaWegeterianska.equals("tak") && dietaWeganska.equals("tak") && dietaBezglutenowa.equals("tak")) System.out.println("Kawiarnia na Rogu");
        if(dietaWegeterianska.equals("tak") && dietaWeganska.equals("nie") && dietaBezglutenowa.equals("nie")) System.out.println("Wloskie Specjaly");
        if(dietaWegeterianska.equals("tak") && dietaWeganska.equals("tak") && dietaBezglutenowa.equals("tak")) System.out.println("Kuchnia u Szefa");

//        if(dietaWegeterianska.equals("tak")) wegeterianskie = true;
//        else wegeterianskie = false;
//
//        System.out.print("Czy ktoras z osob jest na diecie weganskiej?");
//        String dietaWeganska = klawisz.next();
//
//        if(dietaWeganska.equals("tak")) weganskie = true;
//        else weganskie = false;
//
//        System.out.print("Czy ktoras z osob jest na diecie bezglutenowej?");
//        String dietaBezglutenowa = klawisz.next();
//
//        if(dietaBezglutenowa.equals("tak")) bezglutenowe = true;
//        else bezglutenowe = false;


    }
}
