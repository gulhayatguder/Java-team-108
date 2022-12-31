package day02_veriables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir ondalikli sayi giriniz");

        double sayidb= scan.nextDouble();
        System.out.println("lütfen bir tam sayi giriniz");

        int sayiint= scan.nextInt();
        System.out.println("(sayilarin toplami:" +(sayidb+sayiint));
        System.out.println("sayilarin carpimi:"+(sayidb*sayiint) );


    }
}
