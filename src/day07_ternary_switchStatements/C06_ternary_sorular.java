package day07_ternary_switchStatements;

import java.util.Scanner;

public class C06_ternary_sorular {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi%5==0?"sayi besin  tam kati" : "");

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.
        Scanner scan2=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int not= scan.nextInt();
        System.out.println(not>=50 ? "Sinifi gectin " :"Malesef kaldin");

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        char karakter='a';
        System.out.println(karakter>='a'  && karakter<='z' ? (char) (karakter-32) : karakter);

        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        int x=10;
        System.out.println(x>0? x :(-1)*x);



    }

}
