import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int angka = n.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i == 2) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        n.close();
    }

    static void pesan() {
        System.out.println("program selesai");
        return;
    }
}
