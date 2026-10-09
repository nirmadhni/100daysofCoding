
import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = n.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        }

        if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam");
        }

        if (pilihan == 3) {
            System.out.println("Anda memilih Bakso");
        }

        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Pilihan tidak tersedia");
        }

        n.close();
    }
}
