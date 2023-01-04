package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        //   Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi ikinci sayiya bolun
       // ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner sacan= new Scanner(System.in);
        System.out.println("lütfen kulllanicidan bir double sayi aliniz");
        double sayiDbl= sacan.nextDouble();
        System.out.println("lütfen bir tam sayi giriniz");
        int sayiInt= sacan.nextInt();
        System.out.println((int)(sayiDbl/sayiInt));//

    }
}
