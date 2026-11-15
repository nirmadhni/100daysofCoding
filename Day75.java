import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = n.nextLine();

        System.out.print("Masukkan nama kedua: ");
        String nama2 = n.nextLine();

        System.out.print("Masukkan kalimat: ");
        String kalimat = n.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kata = n.nextLine();

        System.out.println("\nHasil Pengecekan:");
        System.out.println("equals: " + nama.equals(nama2));
        System.out.println("equalsIgnoreCase: " + nama.equalsIgnoreCase(nama2));
        System.out.println("contains: " + kalimat.contains(kata));
        System.out.println("isEmpty: " + nama.isEmpty());

        n.close();
    }
}
