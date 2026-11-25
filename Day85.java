import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = n.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = n.nextInt();
        }

        int minimal = data[0];

        for (int i = 1; i < jumlah; i++) {
            if (data[i] < minimal) {
                minimal = data[i];
            }
        }

        System.out.println("Angka terkecil adalah: " + minimal);
    }
}
