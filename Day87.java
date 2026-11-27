import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};

        System.out.println("Data awal:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + i + ": " + data[i]);
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = n.nextInt();

        if (indeks >= 0 && indeks < data.length) {
            System.out.print("Masukkan nilai baru: ");
            data[indeks] = n.nextInt();

            System.out.println("\nData setelah diubah:");
            for (int i = 0; i < data.length; i++) {
                System.out.println("Data ke-" + i + ": " + data[i]);
            }
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
