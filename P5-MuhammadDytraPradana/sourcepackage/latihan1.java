package sourcepackage;

import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int totalNilai = 0;
        int kehadiran = 0;

    for(int i = 0; i < 1; i++){
            System.out.print("Input Kehadiran: ");
            kehadiran = inputScanner.nextInt();
            System.out.print("Input Total Nilai: ");
            totalNilai = inputScanner.nextInt();
        }
        if (totalNilai >= 75 ) {
            System.out.println("Total Nilai: " + totalNilai);
            System.out.println("Kehadiran: " + kehadiran);
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: D");
        }
        inputScanner.close();

    }
    
}
