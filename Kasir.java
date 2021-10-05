import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Total belanja: ");
        int totalSpending = in.nextInt();


        System.out.println();
        if (totalSpending > 100000) {
            System.out.println("Diskon: 5%");
            System.out.println("Total akhir belanja: " + (int) ((double) totalSpending * 9.5));
        } else {
            System.out.println("Diskon: 0%");
            System.out.println("Total akhir belanja: " + totalSpending);
        }

        in.close();
    }
}