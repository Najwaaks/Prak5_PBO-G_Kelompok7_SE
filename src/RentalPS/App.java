package RentalPS;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Rental PS ===");
        System.out.print("Masukkan nama penyewa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan lama sewa (jam): ");
        int lama = input.nextInt();

        System.out.print("Apakah penyewa sering menyewa? (true/false): ");
        boolean sering = input.nextBoolean();

        System.out.println();
        RentalPS4bonus ps4 = new RentalPS4bonus(nama, lama, sering);
        ps4.tampilkanInfo();

        input.close();
    }
}