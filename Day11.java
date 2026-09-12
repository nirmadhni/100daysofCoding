import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {

        // membuat Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // meminta input umur
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // menampilkan hasil input
        System.out.println("\n=== Biodata ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");

        input.close();
    }
}
