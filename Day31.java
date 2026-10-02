import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = n.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = n.nextInt();

        System.out.println("AND (&&): " + (angka1 > 0 && angka2 > 0));
        System.out.println("OR (||): " + (angka1 > 0 || angka2 > 0));
        System.out.println("NOT (!): " + !(angka1 > 0));
    }
}
