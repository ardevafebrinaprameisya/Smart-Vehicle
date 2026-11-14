package latihan3;

public class MobilListrik implements Drivable, Rechargeable {

    public void drive() {
        System.out.println("Mobil listrik berjalan.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}