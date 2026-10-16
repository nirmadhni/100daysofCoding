import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.print("Pilih menu (1-3): ");
        int menu = n.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }

        n.close();
    }
}
