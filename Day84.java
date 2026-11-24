import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = n.nextInt();
        }

        int maksimal = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > maksimal) {
                maksimal = data[i];
            }
        }

        System.out.println("Angka maksimal adalah: " + maksimal);
    }
}
