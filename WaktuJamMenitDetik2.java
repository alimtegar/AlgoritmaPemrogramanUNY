import java.util.Scanner;

public class WaktuJamMenitDetik2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = in.nextInt();

        Jam j = new Jam(totalDetik / 3600, (totalDetik % 3600) / 60, (totalDetik % 3600) % 60);

        System.out.println();
        System.out.println("Waktu: " + padZero(j.hh) + ":" + padZero(j.mm) + ":" + padZero(j.ss));

        in.close();
    }

    public static String padZero(int n) {
        return n < 10 ? "0" + n : "" + n;
    }
}
