package day06_if_ElseStatement;

import java.util.Scanner;

public class C08_ElseIfElse {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

      Scanner scan=new Scanner(System.in);
        System.out.println("lütfen müsteri kartiniz var mi\n evet:'E' \nHayir:'H'");
        char kartVarmi= scan.next().charAt(0);
        System.out.println("aldiginiz ürün adedini yaziniz");
        int urunAdedi= scan.nextInt();
        System.out.println("aldiginiz urunun liste fiyatini giriniz");
        int listeFiyati=scan.nextInt();

        if (kartVarmi=='E' && urunAdedi>10 ){
            System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.8);
        } else if (kartVarmi=='E' && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
        } else if (kartVarmi=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
        } else if (kartVarmi=='H' && urunAdedi>0) {
            System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.9);
        }else{
            System.out.println("Hatali bilgi");


            }}}




