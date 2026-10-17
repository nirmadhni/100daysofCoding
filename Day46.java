import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka (1-3): ");
        int angka = n.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih satu");
                break;
            case 2:
                System.out.println("Anda memilih dua");
                break;
            case 3:
                System.out.println("Anda memilih tiga");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

        n.close();
    }
}
