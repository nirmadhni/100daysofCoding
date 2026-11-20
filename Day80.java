import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int[] nilai = {80, 85, 90, 75, 95};

        System.out.print("Masukkan indeks (0-4): ");
        int indeks = n.nextInt();

        System.out.println("Data pada indeks " + indeks + " adalah: " + nilai[indeks]);

        n.close();
    }
}
