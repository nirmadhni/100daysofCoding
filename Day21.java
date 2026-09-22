import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angkaInt = n.nextInt();

        String hasilString = String.valueOf(angkaInt);

        System.out.println("Nilai awal int    : " + angkaInt);
        System.out.println("Setelah jadi String: " + hasilString);

        n.close();
    }
}
