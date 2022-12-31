package day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alip
       // pozitif ise "pozitif sayi",
       // 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
       // 3 ile bolunebiliyorsa "3'un kati"
       // birler basamagi 7 ise "Mukemmel"
       // seceneklerinden uygun olanlari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi>0){
            System.out.println("sayi pozitif");
            if (100<=sayi && sayi<=999){
                System.out.println("pozitif 3 basamakli sayi");
                if(sayi%3==0);
                System.out.println("sayi 3'ün kati");
                if (sayi%10==7 || sayi%10==-7){
                    System.out.println("sayinin birler basamagi 7");
                }
            }
        }
    }
}
