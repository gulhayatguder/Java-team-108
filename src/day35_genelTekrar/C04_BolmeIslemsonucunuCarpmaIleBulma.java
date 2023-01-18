package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemsonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        // kullanicidan bölünecek sayi ve bölecek sayiyi alip,
        // bölme isleminin sonucunu, carpma islemi ile bulan ve yazdiran bir method olusturalim
        //Buz islem kullanici Q' ya basincaya kadar devam ettirin

        Scanner scan= new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bölunecekSayi=1;
        int bolecekSayi=1;
        do {
            System.out.println("Lütfen bölünecek tam sayiyi girin,\nbitirmek icin Q'ya basin");
            try {
                bölunecekSayi=scan.nextInt();
                System.out.println("Lütfen bolecek sayi giriniz");
            } catch (InputMismatchException e) {



            }

        }while (devamEdelimMi);
    }
}
