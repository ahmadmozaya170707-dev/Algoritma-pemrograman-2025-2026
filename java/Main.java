import java.util.Scanner;

public class Main {

    public static int mainProgram() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama : ");
        String nama = input.nextLine();
        if (!nama.equals("moza")) {
            System.out.println("masukan lagi nama :");
            return mainProgram(); // sama seperti return main() di C++
        }

        System.out.print("masukan NIM");
        int nim = input.nextInt();

        int saldo = nim;
        System.out.println("saldo awal kamu : Rp" + saldo);

        System.out.println("masukan lagi nama :" + nama);
        System.out.println("saldo awal kamu : Rp" + saldo);

        // menu tampilan pertama
        System.out.println("\n=== MENU ATM ===");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Transfer");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        int pilih = input.nextInt();

        // menu kedua (yang dipakai switch)
        System.out.print("pilih menu");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Saldo kamu : Rp" + saldo);
                break;
            case 2:
                System.out.println("tarik tunai (untuk sekarang tidak bisa)");
                break;
            case 3:
                System.out.println("setor tunai (untuk sekarang tidak bisa)");
                break;
            case 4:
                System.out.println("transfer (untuk sekarang tidak bisa)");
                break;
            case 5:
                System.out.println("keluar");
                break;
            default:
                System.out.println("tidak ada");
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        mainProgram();
    }
}
