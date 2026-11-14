package latihan3;

public class MobilBensin implements Drivable, EnginePowered, Fuelable {

    public void drive() {
        System.out.println("Mobil bensin berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}