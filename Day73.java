import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Nama");
            System.out.println("2. Tampilkan Umur");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = n.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Nama: Sri Nirma Ramadhani");
                    break;

                case 2:
                    System.out.println("Umur: 18 tahun");
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);

        n.close();
    }
}
