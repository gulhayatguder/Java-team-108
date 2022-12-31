package day05_IfStatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        String sonuc= "true";
        //if(sonuc){
            System.out.println("");// sistemin calismasi icin if () icindeki ifade blooen olmasi lazim


        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanicidan bir sayi aliniz");
        int sayi=scan.nextInt();
        if(sayi%3==0 && sayi%5==0){
            System.out.println("sayi 3'e  ve 5'e bolünür");

        }
        }
    }

