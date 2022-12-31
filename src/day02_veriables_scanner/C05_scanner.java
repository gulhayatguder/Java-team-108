package day02_veriables_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        // kulllanicidan ismini alin ve alinan ismi buyuk harflerle yazdirin
        // 3 islem yapilir
        // 1. adim..... scanner objesi olusturmak
        Scanner scan=new Scanner(System.in);
        // 2. adim...... kullaniciya ne istediginizi soyleyin

        System.out.println("isminizi yazin");

        //3. adim......... kullanicinin girecegi degeri kaydedecek bir veriable olustur.

        String girilenIsim=scan.nextLine();

        System.out.println(girilenIsim.toUpperCase());

    }
}
