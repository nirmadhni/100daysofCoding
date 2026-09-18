import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("===== OPERATOR PENUGASAN =====");

        System.out.print("Masukkan angka awal: ");
        int angka = n.nextInt();

        System.out.println("\nNilai awal: " + angka);

        angka += 5;
        System.out.println("Setelah += 5: " + angka);

        angka -= 3;
        System.out.println("Setelah -= 3: " + angka);

        angka *= 2;
        System.out.println("Setelah *= 2: " + angka);

        angka /= 2;
        System.out.println("Setelah /= 2: " + angka);

        angka %= 3;
        System.out.println("Setelah %= 3: " + angka);

        input.close();
    }
}
