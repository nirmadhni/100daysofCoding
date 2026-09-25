import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = n.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = n.nextInt();

        int luas = panjang * lebar;

        System.out.println("Luas persegi panjang: " + luas);
    }
}
