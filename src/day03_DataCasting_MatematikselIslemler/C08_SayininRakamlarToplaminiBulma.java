package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //    Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
        Scanner scan=new Scanner(System.in) ;
        System.out.println("lütfen 4 basamakli pozitif bir sayi giriniz");
        int girilenSayi= scan.nextInt();//2457
        int sayi1=girilenSayi%10;
        int sayi2=sayi1%10;
        int sayi3=sayi2%10;
        int sayi4=sayi3%10;

        int rakamlarToplami=(sayi1+sayi2+sayi3+sayi4);
        System.out.println("rakamlarToplami="+rakamlarToplami
        );

    }
}
