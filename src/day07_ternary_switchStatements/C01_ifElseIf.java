package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_ifElseIf {
    public static void main(String[] args) {
        // kullanicidan bir  tam sayi alin.
        // sayi rakam ise "girilen sayi rakam"
        // iki basamakli ise "girilen sayi iki basamakli"
        //sayi iki basamktan buyukse"buyuk sayi " yazdirin.

        /* Eger  if else cumleleri else ile bitmiyorsa tum durumlari kapsamaz,
         yani bazi degerler icin hic bi if badisi calismaz.
         Bu tur sorulari yazarken sartlarin tamamini dikkatli yazmamiz gerekir    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        if (0< girilenSayi && girilenSayi<=9){
        System.out.println("girilen sayi rakam");}
        else if (10<= girilenSayi && girilenSayi<=199) {
            System.out.println("girilen sayi 2 basamakli");

        } else if (girilenSayi>= 100) {
            System.out.println("buyuk sayi");


        }


    }
}
