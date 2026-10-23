import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = n.nextInt();

        int i = 1;

        while (i <= angka) {
            System.out.println(i);
            i++;
        }

        n.close();
    }
}
