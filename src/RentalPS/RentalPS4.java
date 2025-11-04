package RentalPS;

public class RentalPS4 extends RentalPS {

    public RentalPS4(String nama, int lama) {
        super(nama, lama, 10000);
    }

    @Override
    public int hitungBiayaSewa() {
        return lamaSewa * hargaPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Lama Sewa : " + lamaSewa + " jam");
        System.out.println("Total Biaya: Rp " + hitungBiayaSewa());
    }
}