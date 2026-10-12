import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan: ");
        double suhu = n.nextDouble();

        if (suhu >= 30) {
            System.out.println("Ruangan terasa panas");
        }

        if (suhu < 30) {
            System.out.println("Ruangan terasa sejuk");
        }

        n.close();
    }
}
