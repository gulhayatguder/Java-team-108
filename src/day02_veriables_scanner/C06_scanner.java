package day02_veriables_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        //kullanicidan bir sayi isteyin
        // sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println(" karesini almak istediginiz sayiyi giriniz");

        double girilenSayi= scan.nextDouble();
        System.out.println("girilen sayinin karesi="+girilenSayi*girilenSayi);


    }
}
