package day06_if_ElseStatement;

import java.util.Scanner;

public class C01_ifElseStatement {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir ücgenin uc kenar uzulugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2  &&  kenar2== kenar3){
            System.out.println(" eskenar ücgen");
        } else System.out.println("eskenar ücgen degil");


    }
}
