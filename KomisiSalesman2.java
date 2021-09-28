import java.util.Scanner;

public class KomisiSalesman2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();

        System.out.print("Masukkan nilai penjualan: ");
        int nilaiPenjualan = in.nextInt();

        int komisi = (int) (0.05 * (double) nilaiPenjualan);

        System.out.println();
        System.out.println("Komisi salesman \"" + nama + "\": " + komisi);

        in.close();
    }
}
