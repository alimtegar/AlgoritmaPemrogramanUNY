import java.util.Scanner;

public class KonversiNilaiAkhir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double score = in.nextDouble();

        System.out.println();
        System.out.print("Hasil konversi: ");
        if (score >= 86 && score <= 100) {
            System.out.println("A");
        } else if (score >= 81 && score <= 85) {
            System.out.println("A-");
        } else if (score >= 76 && score <= 80) {
            System.out.println("B+");
        } else if (score >= 71 && score <= 75) {
            System.out.println("B");
        } else if (score >= 66 && score <= 70) {
            System.out.println("B-");
        } else if (score >= 61 && score <= 65) {
            System.out.println("C+");
        } else if (score >= 56 && score <= 60) {
            System.out.println("C");
        } else if (score >= 41 && score <= 55) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        in.close();
    }
}