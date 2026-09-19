import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        byte angkaByte = n.nextByte();

        short angkaShort = angkaByte;
        int angkaInt = angkaShort;
        long angkaLong = angkaInt;
        float angkaFloat = angkaLong;
        double angkaDouble = angkaFloat;

        System.out.println("\n=== HASIL KONVERSI OTOMATIS ===");
        System.out.println("Byte   : " + angkaByte);
        System.out.println("Short  : " + angkaShort);
        System.out.println("Int    : " + angkaInt);
        System.out.println("Long   : " + angkaLong);
        System.out.println("Float  : " + angkaFloat);
        System.out.println("Double : " + angkaDouble);

        input.close();
    }
}
