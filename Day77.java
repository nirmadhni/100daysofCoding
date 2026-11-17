import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = n.nextLine();

        System.out.println("\nNama asli: " + nama);
        System.out.println("Jumlah huruf: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Tanpa spasi: " + nama.trim());
        System.out.println("Ganti huruf a: " + nama.replace("a", "o"));
        System.out.println("Ada huruf a: " + nama.contains("a"));
        System.out.println("Apakah nama Nirma? " + nama.equals("Nirma"));

      
    }
}
