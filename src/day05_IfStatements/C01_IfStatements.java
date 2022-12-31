package day05_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // ögrenciden notunu rakam olarak alip harf olarak yazdiriniz
        //0-49,99DD
        //50-64,999 CC


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not= scan.nextDouble();
        if(0<= not&& not<50){
            System.out.println(" notunuz DD, malesef kaldiniz");
            if(50<=not && not<65);{
                System.out.println(" notunuz CC,Tebrikler gectiniz");
                if(65<= not && not< 85){
                    System.out.println(" notunuz BB, ");
                    if(85<= not && not<100){
                        System.out.println("tebrikler; notunuz AA");

                    }
                }
            }
        }
    }
}
