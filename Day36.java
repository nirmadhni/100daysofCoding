import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = n.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }

        n.close();
    }
}
