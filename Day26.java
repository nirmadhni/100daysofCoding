import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan Nama\t: ");
        String nama = n.nextLine();

        System.out.print("Masukkan NIM\t: ");
        String nim = n.nextLine();

        System.out.print("Masukkan Kelas\t: ");
        String kelas = n.nextLine();

        System.out.print("Masukkan Umur\t: ");
        int umur = n.nextInt();
        n.nextLine();

        System.out.print("Masukkan Prodi\t: ");
        String prodi = n.nextLine();

        System.out.print("Masukkan IPK\t: ");
        double ipk = n.nextDouble();

        System.out.print("Status Keaktifan\t: ");
        boolean status = n.nextBoolean();

        System.out.println();
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Umur\t\t: " + umur + " Tahun");
        System.out.println("Prodi\t\t: " + prodi);
        System.out.println("IPK\t\t: " + ipk);
        System.out.println("Status Aktif\t: " + status);
        System.out.println("=============================");
        
        n.close();
    }
}
