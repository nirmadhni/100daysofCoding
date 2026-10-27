import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int angka = n.nextInt();

        System.out.println("Angka 1 sampai N:");
        for (int i = 1; i <= angka; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nAngka N sampai 1:");
        for (int i = angka; i >= 1; i--) {
            System.out.print(i + " ");
        }

        n.close();
    }
}
