import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = n.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = n.nextInt();

        int hasil = (angka1 + angka2) * 2;

        System.out.println("Hasil: " + hasil);

        n.close();
    }
}
