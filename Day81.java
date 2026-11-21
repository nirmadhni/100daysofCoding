import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] nilai = new int[5];

        System.out.println("Masukkan 5 nilai:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = n.nextInt();
        }

        System.out.println("\nSemua nilai yang dimasukkan:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

    }
}
