import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlah = n.nextInt();

        for (int i = jumlah; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        n.close();
    }
}
