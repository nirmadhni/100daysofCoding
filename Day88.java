import java.util.Scanner;

public class Day88 {

    static void tampilkanData(String nama, int umur) {
        System.out.println("\nNama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = n.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = n.nextInt();

        tampilkanData(nama, umur);
    }
}
