import java.util.Scanner;

public class GajiKaryawan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double persenTunjangan = 0.2;
        double persenPajak = 0.15;

        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = in.nextLine();

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = in.nextInt();

        int tunjangan = (int) (persenTunjangan * (double) gajiPokok);
        int pajak = (int) (persenPajak * (double) (gajiPokok + tunjangan));
        int gajiBersih = gajiPokok + tunjangan - pajak;

        System.out.println();
        System.out.println("Gaji bersih karyawan \"" + namaKaryawan + "\": " + gajiBersih);

        in.close();
    }
}
