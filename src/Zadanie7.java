public class Zadanie7 {
    public static void main(String[] args) {
        double sprzedaneProduktyNaRok = 4.6;
        double procentSprzedazRegionMazowiecki = 0.62;

        double sprzedazRegionuMazowiecki = procentSprzedazRegionMazowiecki * sprzedaneProduktyNaRok;

        System.out.println("Region mazowiecki generuje: " + sprzedazRegionuMazowiecki + "mln");
    }
}
