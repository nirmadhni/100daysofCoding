import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();

        System.out.println("Angka ganjil dari 1 sampai N-1:");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap dari 1 sampai N-1:");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
