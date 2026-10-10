
import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = n.nextDouble();

        // Memasukkan operator matematika
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = n.next().charAt(0);

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = n.nextDouble();

        // Operasi penjumlahan
        if (operator == '+') {
            System.out.println("Hasil: " + (angka1 + angka2));

        // Operasi pengurangan
        } else if (operator == '-') {
            System.out.println("Hasil: " + (angka1 - angka2));

        // Operasi perkalian
        } else if (operator == '*') {
            System.out.println("Hasil: " + (angka1 * angka2));

        // Operasi pembagian
        } else if (operator == '/') {

            // Memeriksa apakah angka kedua bukan nol
            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Tidak bisa dibagi dengan nol!");
            }

        // Jika operator tidak valid
        } else {
            System.out.println("Operator tidak valid!");
        }

        n.close();
    }
}
