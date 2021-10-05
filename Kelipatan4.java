import java.util.Scanner;

public class Kelipatan4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();

        System.out.println();
        if (n % 4 == 0) {
            System.out.println("Kelipatan 4");
        } else {
            System.out.println("Bukan kelipatan 4");
        }

        in.close();
    }
}