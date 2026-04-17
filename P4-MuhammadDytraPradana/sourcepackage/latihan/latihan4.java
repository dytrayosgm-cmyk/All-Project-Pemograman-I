package sourcepackage.latihan;

import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // statement 1
        System.out.print("Masukkan jumlah hari yang ingin dihitung: ");
        int jumlahHari = inputScanner.nextInt();

        // variabel akumulator untuk total keseluruhan
        float totalMakanSemua = 0;
        float totalTransportSemua = 0;
        float totalBelanjaSemua = 0;
        float grandTotal = 0;

            // process 1
        for (int hari = 1; hari <= jumlahHari; hari++) {
            System.out.println("\n--- Input Pengeluaran Hari " + hari + " ---");
            
            System.out.print("Makan: ");
            float makan = inputScanner.nextFloat();
            
            System.out.print("Transportasi: ");
            float transportasi = inputScanner.nextFloat();
            
            System.out.print("Belanja: ");
            float belanja = inputScanner.nextFloat();

            float totalHariIni = makan + transportasi + belanja;
            System.out.println("Total Pengeluaran Hari " + hari + ": " + totalHariIni);

                // Cek agar tidak terjadi pembagian dengan nol (jika total = 0)
            totalMakanSemua += makan;
            totalTransportSemua += transportasi;
            totalBelanjaSemua += belanja;
            grandTotal += totalHariIni;
        }

            // statement 2
        System.out.println("\n=====================================");
        System.out.println("   REKAP PENGELUARAN KESELURUHAN");
        System.out.println("=====================================");
        System.out.println("Total Pengeluaran Selama " + jumlahHari + " Hari: " + grandTotal);

      // process 2
        if (grandTotal > 0) {
            float persenMakanTotal = (totalMakanSemua / grandTotal) * 100;
            float persenTransportTotal = (totalTransportSemua / grandTotal) * 100;
            float persenBelanjaTotal = (totalBelanjaSemua / grandTotal) * 100;

            System.out.println("Persentase Makan: " + persenMakanTotal + "%");
            System.out.println("Persentase Transportasi: " + persenTransportTotal + "%");
            System.out.println("Persentase Belanja: " + persenBelanjaTotal + "%");
        } else {
            System.out.println("Tidak ada pengeluaran yang tercatat.");
        }

        inputScanner.close();
    }
}