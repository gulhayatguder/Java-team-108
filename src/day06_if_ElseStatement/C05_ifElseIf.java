package day06_if_ElseStatement;

import java.util.Scanner;

public class C05_ifElseIf {
    public static void main(String[] args) {
        /* kullanicidan notunu girmesini isteyiniz
         * not 85 ve ustu ise AA
         * not 65 ve ustu ise  BB
         * not 50 ve üstü ise  CC
         * geriye kalanlar  DD     */

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not = scan.nextDouble();

        if (not <= 0 || not > 100) {
            System.out.println("girilen not gecersiz");

        } else if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");

        } else if (not >= 50) {
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }
    }}
