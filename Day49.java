import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = n.nextInt();

        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);

        n.close();
    }
}
