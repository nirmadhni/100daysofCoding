import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== BIODATA DIRI ===");

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = input.nextInt();

        System.out.println("\n=== HASIL BIODATA ===");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Prodi \t\t: " + prodi);
        System.out.println("Semester \t: " + semester);

        input.close();
    }
}
