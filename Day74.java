import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = n.nextLine();

        System.out.println("Nama asli: " + nama);
        System.out.println("Jumlah karakter: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        n.close();
    }
}
