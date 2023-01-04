package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /* char data turunun exra bir özelligi vardir
         eger  matematiksel bir islemde char data türünden   bir deger kullanirsaniz java
          o char in ascii degerini goz önünde bulundurarak matematiksel islemi gerceklestirir     */

        System.out.println('a'+'b');



// kullanicidan bir char alip
// ascii table'dan kullanicinin girdigi char'in sonrasindaki
// 3 karakteri yazdirin
// ornek input : a output : b,c,d
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char girilenKarakter=scan.next().charAt(0);
        System.out.println((char) (girilenKarakter+1) + ", "+
                (char) (girilenKarakter+2) + ", "+
                (char) (girilenKarakter+3) );



    }
}
