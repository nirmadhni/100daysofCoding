import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int angka, jumlah = 0;

        do {
            System.out.print("Masukkan angka: ");
            angka = n.nextInt();

            if (angka >= 0) {
                jumlah += angka;
            }

        } while (angka >= 0);

        System.out.println("Total penjumlahan: " + jumlah);

        n.close();
    }
}
