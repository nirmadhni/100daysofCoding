import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] data = new int[5];
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = n.nextInt();

            total += data[i];
        }

        System.out.println("Total seluruh nilai: " + total);
    }
}
