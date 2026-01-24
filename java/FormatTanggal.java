import java.util.Date;
public class FormatTanggal {
    public static void main(String args[])
    {
        Date tanggal = new Date();
        System.out.printf("Cetak Tanggal : %td %<tB %<tY", tanggal);
    }
}
