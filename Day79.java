import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] skor = new int[5];

        System.out.println("Masukkan 5 skor:");

        for (int i = 0; i < skor.length; i++) {
            System.out.print("Skor ke-" + (i + 1) + ": ");
            skor[i] = n.nextInt();
        }

        System.out.println("\nIsi Array:");

        for (int i = 0; i < skor.length; i++) {
            System.out.println("Skor ke-" + (i + 1) + ": " + skor[i]);
        }

        n.close();
    }
}
