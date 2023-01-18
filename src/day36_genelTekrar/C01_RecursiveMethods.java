package day36_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tam sayi alip 
        // o sayidan sifira kadar olan pozitif tam sayilari tolayin


        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        
        toplaForloopIle(sayi);
        toplaRecursive(sayi);
    }

    private static void toplaRecursive(int sayi) {
    }

    private static void toplaForloopIle(int sayi) {
        int toplam=0;
        for (int i = 0; i <sayi ; i++) {

        }
    }

}
