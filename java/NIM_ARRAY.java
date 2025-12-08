import java.util.Scanner;

public class NIM_ARRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // ubah string menjadi array digit
        int[] digit = new int[nim.length()];
        for (int i = 0; i < nim.length(); i++) {
            digit[i] = nim.charAt(i) - '0';
        }

        // Total
        int total = 0;
        for (int d : digit) {
            total += d;
        }

        // Maksimum
        int maks = digit[0];
        for (int d : digit) {
            if (d > maks) {
                maks = d;
            }
        }

        // Minimum
        int minin = digit[0];
        for (int d : digit) {
            if (d < minin) {
                minin = d;
            }
        }

        // Rata-rata
        double rata = (double) total / digit.length;

        // Reverse array
        int[] rev = new int[digit.length];
        int idx = 0;
        for (int i = digit.length - 1; i >= 0; i--) {
            rev[idx++] = digit[i];
        }

        // Output
        System.out.print("Digit : ");
        for (int d : digit) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Total = " + total);
        System.out.println("Maksimum = " + maks);
        System.out.println("Minimum = " + minin);
        System.out.println("Rata-rata = " + rata);

        System.out.print("Reverse array: ");
        for (int d : rev) {
            System.out.print(d + " ");
        }
        System.out.println();

        input.close();
    }
}
