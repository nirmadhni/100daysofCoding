import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan gaji: ");
        double gaji = n.nextDouble();

        if (gaji >= 5000000) {
            gaji = gaji - 500000;
        } else {
            gaji = gaji - 200000;
        }

        System.out.println("Gaji bersih: Rp" + gaji);

        n.close();
    }
}
