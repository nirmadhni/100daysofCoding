import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan nilai double: ");
        double angkaDouble = n.nextDouble();

        float angkaFloat = (float) angkaDouble;
        long angkaLong = (long) angkaFloat;
        int angkaInt = (int) angkaLong;
        short angkaShort = (short) angkaInt;
        byte angkaByte = (byte) angkaShort;

        System.out.println("\n===== HASIL KONVERSI =====");
        System.out.println("Double : " + angkaDouble);
        System.out.println("Float  : " + angkaFloat);
        System.out.println("Long   : " + angkaLong);
        System.out.println("Int    : " + angkaInt);
        System.out.println("Short  : " + angkaShort);
        System.out.println("Byte   : " + angkaByte);

        input.close();
    }
}
