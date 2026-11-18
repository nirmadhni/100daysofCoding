import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String username, password;
        String loginUser, loginPass;

        System.out.println("===== BUAT AKUN =====");
        System.out.print("Masukkan Username : ");
        username = n.nextLine();

        System.out.print("Masukkan Password : ");
        password = n.nextLine();

        while (true) {
            System.out.println("\n===== Login =====");

            System.out.print("Masukkan Username : ");
            loginUser = n.nextLine();

            System.out.print("Masukkan Password : ");
            loginPass = n.nextLine();

            if (loginUser.equals(username) &&
                loginPass.equals(password)) {

                System.out.println("Login berhasil, Selamat datang");
                break;

            } else {
                System.out.println("Login gagal!, Coba lagi");
            }
        }

    }
}
