import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = n.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = n.nextInt();

        System.out.println("Apakah angka sama? " + (angka1 == angka2));
        System.out.println("Apakah angka berbeda? " + (angka1 != angka2));

        n.close();
    }
}
