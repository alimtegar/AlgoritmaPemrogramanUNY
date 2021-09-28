import java.util.Scanner;

public class WaktuDetik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jam: ");
        int hh = in.nextInt();

        System.out.print("Masukkan menit: ");
        int mm = in.nextInt();

        System.out.print("Masukkan detik: ");
        int ss = in.nextInt();

        Jam j = new Jam(hh, mm, ss);
        int totalDetik = (j.hh * 3600) + (j.mm * 60) + j.ss;

        System.out.println();
        System.out.println("Total detik: " + totalDetik);

        in.close();
    }
}
