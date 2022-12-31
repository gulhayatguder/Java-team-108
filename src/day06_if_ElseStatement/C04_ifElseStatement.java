package day06_if_ElseStatement;

import java.util.Scanner;

public class C04_ifElseStatement {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char grilenKarakter=scan.next().charAt(0);

        if (grilenKarakter>='A' && grilenKarakter<='Z'){
            System.out.println("girilen karakter büyük harf");
        } else {
            System.out.println("girilen karakter buyuk harf degil");
        }
        /* (grilenKarakter>=65 && grilenKarakter<=90){System.out.println("girilen karakter büyük harf");
               } else {System.out.println("girilen karakter buyuk harf degil");
        */

    }
}
