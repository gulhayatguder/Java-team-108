package day13_MethodOverloiding_whileLoop;

import java.util.Scanner;

public class C06_SifreIsteme {
    public static void main(String[] args) {
         //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        // Sifre kontrolunu bir metoda yaptirip true/ fals dondurun
        // sonucu kontrol edip "Basari ile olusturuldu" yazincaya kadar
        // sifreyi tekrar isteyin
        Scanner scan=new Scanner(System.in);
        boolean tekrarSifreIste=true;
        String sifre="";
        while (tekrarSifreIste){
            System.out.println("Lütfen sifrenizi giriniz");
            sifre= scan.nextLine();
        }

    }
}
