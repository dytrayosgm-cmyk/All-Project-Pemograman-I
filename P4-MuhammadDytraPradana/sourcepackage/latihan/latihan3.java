package sourcepackage.latihan;

import java.util.Scanner;

public class latihan3 { // Huruf kapital di awal
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Menggunakan perulangan (loop) untuk 3 hari
        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("\n--- Input Pengeluaran Hari " + hari + " ---");
            
            System.out.print("Makan: ");
            float makan = inputScanner.nextFloat();
            
            System.out.print("Transportasi: ");
            float transportasi = inputScanner.nextFloat();
            
            System.out.print("Belanja: ");
            float belanja = inputScanner.nextFloat();

            // Perhitungan Total
            float total = makan + transportasi + belanja;
            System.out.println("Total Pengeluaran Hari " + hari + ": " + total);

            // Cek agar tidak terjadi pembagian dengan nol (jika total = 0)
            if (total > 0) {
                float persenMakan = (makan / total) * 100;
                float persenTransportasi = (transportasi / total) * 100;
                float persenBelanja = (belanja / total) * 100;
                
                System.out.println("Persentase Makan: " + persenMakan + "%");
                System.out.println("Persentase Transportasi: " + persenTransportasi + "%");
                System.out.println("Persentase Belanja: " + persenBelanja + "%");
                
                // Menampilkan total persentase (pastinya ~100%)
                float totalPersen = persenMakan + persenTransportasi + persenBelanja;
                System.out.println("Total Persentase Hari " + hari + ": " + totalPersen + "%");
            } else {
                System.out.println("Tidak ada pengeluaran hari ini.");
            }
        }

        // Menutup scanner
        inputScanner.close();
    }
}