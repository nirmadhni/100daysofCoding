import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        int a = n.nextInt();

        System.out.print("Masukkan nilai B: ");
        int b = n.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);
    }
}
