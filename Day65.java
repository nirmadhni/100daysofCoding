import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jumlah garis: ");
        int jumlah = n.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("|");
        }

        n.close();
    }
}
