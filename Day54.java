import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nama  :");
        String nama = n.nextLine();

        System.out.print("Masukkan umur  :");
        int umur = n.nextInt();

        System.out.println("Nama  :" + nama);
        System.out.println("Umur  :" + umur + "tahun");

        n.close();
    }
}
