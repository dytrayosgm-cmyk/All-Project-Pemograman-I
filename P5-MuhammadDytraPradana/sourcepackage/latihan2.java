package sourcepackage;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- BAGIAN INPUT ---
        System.out.print("Input Kehadiran : ");
        int kehadiran = input.nextInt();

        System.out.print("Input Nilai akhir : ");
        double nilai = input.nextDouble();

        String grade = "E"; 

        // --- LOGIKA PENENTUAN GRADE AWAL ---
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) { 
            grade = "C"; 
        }

        // --- VALIDASI KEHADIRAN ---
        double validasi = 21 * 75.0 / 100.0;

        System.out.println("\n--- HASIL ---");

        if (kehadiran < validasi) {
            if (nilai >= 55) {
                grade = "D"; 
            } 
            
            System.out.println("Grade : " + grade);
            System.out.println("kamu tidak lulus");

        } else {
            System.out.println("Nilai : " + nilai);
            System.out.println("grade : " + grade);
        }

        input.close();
    }
}