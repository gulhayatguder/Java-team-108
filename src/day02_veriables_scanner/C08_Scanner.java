package day02_veriables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //   kullanicidan bir diktortgenin iki kenar uzunlugunu alip, dikdörtgenin alanini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin iki kenar uzunlugunu girin");
        double kenar1= scan. nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Diktörtgenin alani:"+kenar1*kenar2);
        

    }
}
