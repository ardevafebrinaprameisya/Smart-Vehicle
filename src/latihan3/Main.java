package latihan3;

public class Main {
    public static void main(String[] args) {

        MobilListrik mobilListrik = new MobilListrik();
        MobilBensin mobilBensin = new MobilBensin();
        Sepeda sepeda = new Sepeda();

        System.out.println("=== MOBIL LISTRIK ===");
        mobilListrik.drive();
        mobilListrik.isiBaterai();

        System.out.println("\n=== MOBIL BENSIN ===");
        mobilBensin.startEngine();
        mobilBensin.drive();
        mobilBensin.isiBahanBakar();

        System.out.println("\n=== SEPEDA ===");
        sepeda.drive();
    }
}