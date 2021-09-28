import java.util.Scanner;

public class TitikTengahDuaTitik2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan x untuk P1: ");
        int p1X = in.nextInt();

        System.out.print("Masukkan y untuk P1: ");
        int p1Y = in.nextInt();

        System.out.print("Masukkan x untuk P2: ");
        int p2X = in.nextInt();

        System.out.print("Masukkan y untuk P2: ");
        int p2Y = in.nextInt();

        Titik p1 = new Titik(p1X, p1Y);
        Titik p2 = new Titik(p2X, p2Y);
        Titik p3 = new Titik((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);

        System.out.println();
        System.out.println("P3: (" + p3.x + ", " + p3.y + ")");

        in.close();
    }
}
