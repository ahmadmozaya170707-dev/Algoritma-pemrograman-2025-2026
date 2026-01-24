import java.util.Scanner;

public class baper {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner masukan = new Scanner(System.in);
    String nama;
    System.out.println("Masukkan nama Anda");
    nama = masukan.nextLine(); // Coba ganti menjadi masukan.next();
    System.out.println("Selamat Datang, " + nama);
    }
}
