package day06_if_ElseStatement;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen ikizkenar ise
       //“Ikizkenar ucgen” yazdirin, degilse ikizkenar degil yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir ücgenin üc kenarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
         if ((kenar1==kenar2 && kenar2!=kenar3) ||
             (kenar2==kenar3 && kenar3!=kenar1)||
        (kenar1==kenar3 && kenar3!=kenar2)){
             System.out.println("ikiz kenar ücgen");

        }else System.out.println("ikiz kenar ucgen degil");
         



        }
        }



