package day07_ternary_switchStatements;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
         /*kullanicidan alinan deger yuzden buyukse
         sayiyi iki ile carpin
           Yuze esit veya yuzden kucukse sayuiya 10 ekleyin */

         int input=170;

        input= input>100? input*2 : input+10 ;
        System.out.println(input);

    }
}
