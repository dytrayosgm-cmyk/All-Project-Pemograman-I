package SourcePackage.Latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG LUAS PERSEGI ===");

        // --- S1: INPUT ---
        // Meminta pengguna memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        // --- P1: PROSES ---
        // Menghitung luas menggunakan rumus: sisi * sisi
        double luas = sisi * sisi;

        // --- S2: MENAMPILKAN HASIL ---
        // Mencetak hasil perhitungan ke layar
        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Panjang Sisi : " + sisi);
        System.out.println("Luas Persegi : " + luas);

        input.close();
    }
}
