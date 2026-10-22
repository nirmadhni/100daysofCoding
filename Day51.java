import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("masukkan jumlah perulangan: ");
        int jumlah = n.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("perulangan ke-" + i);
        }

        n.close();
    }
}
