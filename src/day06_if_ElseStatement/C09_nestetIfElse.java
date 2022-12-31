package day06_if_ElseStatement;

import java.util.Scanner;

public class C09_nestetIfElse {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        /*  eger degisken sayimiz birden fazla ise
           degiskenlerden birini oncelige alarak,
           ona gore bir if else yapisi kurulur
           ornegin bu soruda kadin/erken secimini ana degisken yapalim
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz kadin:'k'  kadin:'K'\n erkek:'e' erkek:'E'");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'k' || cinsiyet == 'K') {
            if (yas>=60 && yas<80 ){
                System.out.println("emekli olabilirsiniz");
            }
            else if (yas<60 && yas>=18) {
                System.out.println("emekli olmak icin" +( 65-yas)+ " yil calismalisiniz");

            }


        } else if (cinsiyet == 'e' || cinsiyet == 'E') {

            if (yas>=65   && yas<80 ){
                System.out.println("emekli olabilirsiniz");
            }
            else if (yas<65 && yas>=18) {
                System.out.println("emekli olmak icin" +( 65-yas)+ "yil calismalisiniz");

            }

        }
        else {
            System.out.println("hatali bilgi");

        }

    }}
