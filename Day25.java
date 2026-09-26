import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = n.nextDouble();

        double luas = Math.PI * jariJari * jariJari;

        System.out.println("Luas lingkaran: " + luas);
    }
}
