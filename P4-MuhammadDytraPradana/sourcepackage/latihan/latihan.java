import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Realisasi: ");
        float realisasi = input.nextFloat();
        System.out.println("Input Kehadiran: ");
        float kehadiran = input.nextFloat();
        System.out.println("Input Tugas: ");
        float tugas = input.nextFloat();
        System.out.println("Input UTS: ");
        float uts = input.nextFloat();
        System.out.println("Input UAS: ");
        float uas = input.nextFloat();

        float b_kehadiran = (float) (kehadiran/realisasi * 10);
        float b_tugas = (float) (tugas * 20/100);
        float b_uts = (float) (uts * 30/100);
        float b_uas = (float) (uas * 40/100);
        float total = b_kehadiran + b_tugas + b_uts + b_uas;
        System.out.println("Nilai Akhir: " + total);

        System.out.println("Kehadiran Kamu: " + kehadiran);
        System.out.println("Tugas Kamu: " + b_tugas);
        System.out.println("UTS Kamu: " + b_uts);
        System.out.println("UAS Kamu: " + b_uas);
        System.out.println("Total Nilai Kamu: " + total);

        input.close();
    }
    
}
