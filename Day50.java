import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = n.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan " + hasil);

        n.close();
    }
}
