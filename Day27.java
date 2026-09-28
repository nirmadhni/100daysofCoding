import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = n.nextInt();

        System.out.println("Nilai awal : " + angka);

        angka++;
        System.out.println("Setelah increment : " + angka);

        angka--;
        System.out.println("Setelah decrement : " + angka);

        n.close();
    }
}
