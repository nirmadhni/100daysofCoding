import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan panjang garis: ");
        int panjang = n.nextInt();

        for (int i = 1; i <= panjang; i++) {
            System.out.print("_");
        }

        n.close();
    }
}
