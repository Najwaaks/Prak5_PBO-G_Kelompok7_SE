package RentalPS;

class RentalPS4bonus extends RentalPS4 implements BonusMember {
    private boolean seringMenyewa;

    public RentalPS4bonus(String namaPenyewa, int lamaSewa, boolean seringMenyewa) {
        super(namaPenyewa, lamaSewa);
        this.seringMenyewa = seringMenyewa;
    }

    @Override
    public void beriBonus() {
        if (seringMenyewa) {
            System.out.println("Bonus: Tambahan 1 jam gratis!");
        } else {
            System.out.println("Belum memenuhi syarat untuk bonus.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        beriBonus();
    }
}