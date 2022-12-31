package day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yazdirmak istediginiz ayin ilk harfini yaziniz");
      char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='O'|| ilkHarf== 'O') System.out.println("ocak");
        if (ilkHarf=='s'|| ilkHarf== 'S') System.out.println("subat");
        if (ilkHarf=='m'|| ilkHarf== 'M') System.out.println("mart, mayis");
        if (ilkHarf=='n'|| ilkHarf== 'N') System.out.println("haziran");
        if (ilkHarf=='h'|| ilkHarf== 'H') System.out.println("eylul,ekim");
        if (ilkHarf=='t'|| ilkHarf== 'T') System.out.println("kasim");
        if (ilkHarf=='a'|| ilkHarf== 'A') System.out.println("aralik, agustos");
        if (ilkHarf=='e'|| ilkHarf== 'E') System.out.println("ocak");
        if (ilkHarf=='k'|| ilkHarf== 'K') System.out.println("ocak");
    }
}
