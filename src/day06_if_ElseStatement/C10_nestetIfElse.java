package day06_if_ElseStatement;

import java.util.Scanner;

public class C10_nestetIfElse {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin



         Scanner scan=new Scanner(System.in);
        System.out.println("müsteri kartiniz var mi \n Evet:'e'\nhayir:'h'");
        char kart=scan.next().charAt(0);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("lütfen liste fiyatini giriniz");
        int urunFiyati= scan.nextInt();
        if (kart=='e'){
            if (urunAdedi>10){
                System.out.println("%20 indirimli fiyat=" + (urunAdedi*urunFiyati*0.80));
            }
            else if (urunAdedi<=10) {
                System.out.println("% 15 indirimli fiyat="+ (urunAdedi*urunFiyati*0.85));

            }


        }
        else if (kart=='h') {
            if (urunAdedi>10){
                System.out.println("%15 indirimli fiyat=" + (urunAdedi*urunFiyati*0.85));
            }
            else if (urunAdedi<=10) {
                System.out.println("% 10 indirimli fiyat="+ (urunAdedi*urunFiyati*0.90));

            }

        }
        else {
            System.out.println("kart bilgisi gecersiz");


        }
    }
}