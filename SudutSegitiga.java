import java.util.Scanner;

public class SudutSegitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sisi a: ");
        int a = in.nextInt();

        System.out.print("Sisi b: ");
        int b = in.nextInt();

        System.out.print("Sisi c: ");
        int c = in.nextInt();

        System.out.println();
        if (c * c > a * a + b * b) {
            System.out.println("Segitiga lancip");
        } else if (c * c < a * a + b * b) {
            System.out.println("Segitiga tumpul");
        } else if (c * c == a * a + b * b) {
            System.out.println("Segitiga tumpul");
        } else {
            System.out.println("Segitiga tidak diketahui");
        }

        in.close();
    }
}