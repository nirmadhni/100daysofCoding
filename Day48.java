import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = n.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = n.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = n.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        n.close();
    }
}
