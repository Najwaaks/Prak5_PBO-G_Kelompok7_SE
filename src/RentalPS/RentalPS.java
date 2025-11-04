package RentalPS;

public abstract class RentalPS {
    String namaPenyewa;
    int lamaSewa;
    int hargaPerJam;

    public RentalPS(String namaPenyewa, int lamaSewa, int hargaPerJam){
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    public abstract int hitungBiayaSewa();
    public abstract void tampilkanInfo();
}