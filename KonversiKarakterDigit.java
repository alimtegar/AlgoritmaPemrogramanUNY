import java.util.Scanner;

public class KonversiKarakterDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan karakter digit: ");
        
        if (in.hasNextInt()) {
            int charDigit = in.nextInt();

            if(charDigit >= 0 && charDigit <= 9) {
                System.out.println();
                System.out.println("Hasil konversi: " + charDigit);
            } else {
                System.out.println();
                System.out.println("Hasil konversi: -1");
            }
        }

        in.close();
    }
}