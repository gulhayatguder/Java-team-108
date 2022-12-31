package day09_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str="Java ögrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));//true
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith("z"));//true
        System.out.println(str.endsWith(" "));//false
        System.out.println(str.endsWith("Java ögrenen issiz kalmaz"));//true

        //kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //- mail @gmail.com icermiyorsa, "mail gmail olmali"
        //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mailinizi giriniz");
        String mail=scan.nextLine();
        if (!mail.contains("@")) System.out.println("gecersiz mail");
        else if (!mail.contains("@gmail")) {
            System.out.println("mail @gmail olmali");


        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }


    }
}
