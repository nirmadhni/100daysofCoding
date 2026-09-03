public class Day02 {
    public static void main(String[] args) {

        // Menggunakan println()
        System.out.println("BIODATA DIRI");
        System.out.println("Nama: Sri Nirma Ramadhani");
        System.out.println("NIM: D0226328");
        System.out.println("Prodi: Informatika");

        // Menggunakan print()
        System.out.print("Kampus: ");
        System.out.print("Universitas Sulawesi Barat\n");

        // Menggunakan printf()
        String nama = "Sri Nirma Ramadhani";
        String nim = "D0226328";
        String prodi = "Informatika";
        int semester = 1;

        System.out.printf("Nama saya %s, NIM saya %s, saya mahasiswa Prodi %s semester %d.",
                nama, nim, prodi, semester);
    }
}
