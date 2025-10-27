import java.util.Scanner;

public class nilai1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan angka pertama:");
        int a=sc.nextInt();
        System.out.print("Masukan angka kedua:");
        int b=sc.nextInt();

        if(a>b)
            System.out.print(a+"lebih besar dari"+b);
        else if(a<b)
            System.out.print(a+"lebih kecil dari"+b);
        else
            System.out.print("keduanya sama besar");

        System.out.print("Apakah keduanya sama?"+(a==b));
    }
}
