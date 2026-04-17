package SourcePackage.Latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KASIR SEDERHANA ===");

        // --- S1: INPUT ---
        System.out.print("Masukkan harga barang (Rp): ");
        double hargaAwal = input.nextDouble();

        System.out.print("Masukkan persentase diskon (%): ");
        double diskonPersen = input.nextDouble();

        // --- P1: PROSES ---
        double nominalDiskon = hargaAwal * (diskonPersen / 100);
        double hargaAkhir = hargaAwal - nominalDiskon;

        // --- S2: MENAMPILKAN HASIL ---
        System.out.println("\n--- STRUK PEMBAYARAN ---");
        System.out.println("Harga Awal    : Rp " + hargaAwal);
        System.out.println("Potongan Harga: Rp " + nominalDiskon);
        System.out.println("Total Bayar   : Rp " + hargaAkhir);

        input.close();
    }
}