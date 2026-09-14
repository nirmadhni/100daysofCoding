import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


      
        // SOAL NO 1

        byte angkaByte = 3;
        int angkaInt = 10;
        float angkaFloat = 5.5f;
        double angkaDouble = 10.5;

        System.out.println("===== SEBELUM UPDATE =====");
        System.out.println("Byte   : " + angkaByte);
        System.out.println("Int    : " + angkaInt);
        System.out.println("Float  : " + angkaFloat);
        System.out.println("Double : " + angkaDouble);

        // Update nilai
        angkaByte = 4;
        angkaInt = 20;
        angkaFloat = 6.5f;
        angkaDouble = 20.5;

        System.out.println("\n===== SETELAH UPDATE =====");
        System.out.println("Byte   : " + angkaByte);
        System.out.println("Int    : " + angkaInt);
        System.out.println("Float  : " + angkaFloat);
        System.out.println("Double : " + angkaDouble);


      

        // SOAL NO 2

        // 9 tipe data Java
        String nama = "Nirma";
        byte umur = 18;
        short tahunMasuk = 2026;
        int jumlahSks = 24;
        long nimAngka = 226328;
        float tinggiBadan = 156.5f;
        double ipk = 4.00;
        char kelas = 'C';
        boolean aktif = true;

        // Menampilkan data
        System.out.println("BIODATA MAHASISWA");

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jumlah Sks: " + jumlahSks);
        System.out.print("NIM: " + nimAngka + "\n");
        System.out.printf("Tinggi Badan %f", tinggiBadan);
        System.out.println("\nIPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("Status Aktif: " + aktif);

        System.out.println("================================");


      

        // SOAL NO 3

        System.out.print("Nama: ");
        String namaInput = a.nextLine();

        System.out.print("Umur: ");
        int umurInput = a.nextInt();

        a.nextLine();

        System.out.print("Tanggal lahir: ");
        byte tanggal = a.nextByte();

        System.out.print("Bulan lahir: ");
        short bulan = a.nextShort();

        System.out.print("Tahun lahir: ");
        long tahun = a.nextLong();

        System.out.print("Berat badan: ");
        float bb = a.nextFloat();

        System.out.print("Tinggi badan: ");
        double tb = a.nextDouble();

        System.out.print("Kelas: ");
        char kelasInput = a.next().charAt(0);

        System.out.print("Status aktif mahasiswa: ");
        boolean status = a.nextBoolean();

        System.out.println("======= BIODATA =======");
        System.out.println("Nama\t\t\t: " + namaInput);
        System.out.println("Umur\t\t\t: " + umurInput);
        System.out.println("Tanggal lahir\t\t: " + tanggal + " " + bulan + " " + tahun);
        System.out.println("Berat badan\t\t: " + bb);
        System.out.println("Tinggi badan\t\t: " + tb);
        System.out.println("Kelas\t\t\t: " + kelasInput);
        System.out.println("Status mahasiswa\t: " + status);

        a.close();
    }
}
