import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = n.nextInt();

        if (nilai >= 75) {

            if (nilai >= 90) {
                System.out.println("Predikat: A");
            } else {
                System.out.println("Predikat: B");
            }

        } else {

            if (nilai >= 60) {
                System.out.println("Predikat: C");
            } else {
                System.out.println("Predikat: D");
            }
        }

        n.close();
    }
}
