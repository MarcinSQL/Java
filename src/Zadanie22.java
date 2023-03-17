public class Zadanie22 {
    public static void main(String[] args) {

        int iloscZakupionychAkcji = 1000;
        int iloscSprzedanychAkcji = 1000;
        double cenaSprzedanychAkcji = 33.92;
        double cenaKupionychAkcji = 32.87;
        double prowizja = 0.02;
        double zaplaconaProwizja1 = iloscZakupionychAkcji *(cenaKupionychAkcji * prowizja);

        double kwotaZaplaconaZaKupno = (iloscZakupionychAkcji * cenaKupionychAkcji) + zaplaconaProwizja1;

        double zaplaconaProwizja2 = iloscSprzedanychAkcji *(cenaSprzedanychAkcji * prowizja);

        double kwotaOtrzymanaZaSprzedaz = (iloscSprzedanychAkcji * cenaSprzedanychAkcji) - zaplaconaProwizja2;

        double zysk = kwotaOtrzymanaZaSprzedaz - kwotaZaplaconaZaKupno;

        System.out.println("Kwota zaplacona za akcje: " + kwotaZaplaconaZaKupno + "\nKwota prowizji: " + zaplaconaProwizja1 + "\nKwota otrzymana za sprzedaz: " + kwotaOtrzymanaZaSprzedaz + "\nWartosc prowizji przy sprzedazy: " + zaplaconaProwizja2 + "\nZysk: " + zysk);


    }
}
