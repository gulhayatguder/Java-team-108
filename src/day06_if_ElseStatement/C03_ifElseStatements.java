package day06_if_ElseStatement;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {

       //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);
        if (girilenHarf>='a' && girilenHarf<='z'){
            System.out.println("girilen harf:"+ (char)(girilenHarf-32));

        }  else System.out.println("girilen harf:"+ girilenHarf);


    }
}
