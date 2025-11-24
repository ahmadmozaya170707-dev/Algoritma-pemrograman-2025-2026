import java.util.Scanner;

public class kasirmini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang : ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga barang : ");
        int harga = input.nextInt();

        System.out.print("Masukkan jumlah beli : ");
        int jumlah = input.nextInt();

        int total = harga * jumlah;
        double diskon;

        if (total > 56500) {
            diskon = total * 0.0;   // 0% seperti di kode Python kamu
        } else {
            diskon = 0;
        }

        double totalBayar = total - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama barang   : " + nama);
        System.out.println("Harga satuan  : " + harga);
        System.out.println("Jumlah beli   : " + jumlah);
        System.out.println("Total harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total bayar   : " + totalBayar);
        System.out.println("===========================");

        input.close();
    }
}
