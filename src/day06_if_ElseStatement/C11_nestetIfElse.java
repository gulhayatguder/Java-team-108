package day06_if_ElseStatement;

import java.util.Scanner;

public class C11_nestetIfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("ürünün liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();
        System.out.println("müsteri kartiniz var mi?\nE:evet H:hayir");
        char kartVarmi=scan.next().charAt(0);

        // ürün miktari  ana degisken olsun

        if (urunAdedi>10){// ürün sayisi 10 dan fazla

        } else if (urunAdedi>0) {//ürün sayisi 1-10 arasi

        }else {//ürün sayisi o veya daha az

        }
    }
}
