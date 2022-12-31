package Day08_stringManipulation;

import java.util.Scanner;

public class C01_stringManipulation {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfan gün ismii giriniz");

        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        // strin ifadeler case sensitive'dir. paZar,PAzar;PAZAR;........gibi 32 farkli sekilde yazilir
        switch (kullanilacakGun) {
            case "pazartesi:":
                System.out.println( girilenGun +" calisma zamani tatile 5 gün var");
        }
    }
}
