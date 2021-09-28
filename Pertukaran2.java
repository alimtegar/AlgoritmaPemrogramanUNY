public class Pertukaran2 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println("Nilai A: " + a);
        
        int b = 5;
        System.out.println("Nilai B: " + b);
        

        int c = a;
        a = b;
        b = c;

        System.out.println();
        System.out.println("Nilai A dan B setelah ditukar:");
        System.out.println("Nilai A: " + a);
        System.out.println("Nilai B: " + b);
    }
}