package day06_if_ElseStatement;

import java.util.Scanner;

public class C06_ifElseIf {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz\n kadin='k'\nerkek='e'");

       char cinsiyet=scan.next().charAt(0);
        System.out.println("lütfen yasinizi  tam sayi olarak giriniz");
        int yas=scan.nextInt();
        if (cinsiyet== 'k' && yas>60 && yas<80 ){
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='k' && yas<60) {
            System.out.println("emekli olmaniza "+(60-yas)+"" + " yil var" );

        } else if (cinsiyet=='e' && yas>65 && yas<80 ){
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='e' && yas<65) {
            System.out.println("emekli olmaniza"+(65-yas)+"yil var" ); {

        }

    }





    }
}
