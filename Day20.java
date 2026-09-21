import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka integer: ");
        String angkaInt = n.nextLine();

        System.out.print("Masukkan angka desimal: ");
        String angkaDouble = n.nextLine();

        int hasilInt = Integer.parseInt(angkaInt);
        double hasilDouble = Double.parseDouble(angkaDouble);

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Integer : " + hasilInt);
        System.out.println("Double  : " + hasilDouble);

        input.close();
    }
}
