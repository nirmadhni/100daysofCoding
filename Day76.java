import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = n.nextLine();

        System.out.println("Substring: " + teks.substring(0, 4));
        System.out.println("Replace: " + teks.replace("a", "o"));
        System.out.println("Trim: " + teks.trim());
    }
}
