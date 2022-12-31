package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_ifElseIf {
    public static void main(String[] args) {
        // kullanicidan bir  tam sayi alin.
        // sayi rakam ise "girilen sayi rakam"
        // iki basamakli ise "girilen sayi iki basamakli"
        //sayi iki basamktan buyukse"buyuk sayi " yazdirin.
        // sayi negetifse " Negatif sayi"



        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        if (girilenSayi<0) System.out.println("Negatif sayi");
        else if (girilenSayi<=9) System.out.println("girilen sayi rakim");
        else if (girilenSayi<=99) System.out.println("girilen sayi iki basamakli");
        else if (girilenSayi>99) System.out.println(" girilen sayi buyuk sayi");{



        }
        {

        }
        {

        }
    }
}
