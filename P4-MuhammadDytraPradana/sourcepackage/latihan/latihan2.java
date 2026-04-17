import java.util.Scanner;

public class latihan2 {
    public  static void main(String[] args) {
    
       Scanner inputScanner = new Scanner(System.in);
       System.out.println("Makan: ");
       float makan = inputScanner.nextFloat();
       System.out.println("Transportasi: ");
       float transportasi = inputScanner.nextFloat();
       System.out.println("Belanja: ");
       float belanja = inputScanner.nextFloat();


       float total = makan + transportasi + belanja;
       System.out.println("Total Pengeluaran: " + total);


       float persenMakan = (makan/total) * 100;
       float persenTransportasi = (transportasi/total) * 100;
       float persenBelanja = (belanja/total) * 100;
       System.out.println("Persentase Makan: " + persenMakan + "%");
       System.out.println("Persentase Transportasi: " + persenTransportasi + "%");
       System.out.println("Persentase Belanja: " + persenBelanja + "%");

       float totalHari1 = (persenMakan + persenTransportasi + persenBelanja) / 100;
       System.out.println("Total Hari 1: " + totalHari1);

         inputScanner.close();
    }
    
}
