import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};

        System.out.print("Masukkan nilai yang dicari: ");
        int cari = n.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                System.out.println("Nilai ditemukan pada indeks: " + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai tidak ditemukan");
        }
    }
}
