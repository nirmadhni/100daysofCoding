import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = n.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = n.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
