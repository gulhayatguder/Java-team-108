package day13_MethodOverloiding_whileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak uzere sayi alin girilen sayilarin toplami 500 olur veya gecerse
        // bu kadar sayi yeter deyip yazdirin


        // bu soruyu illa da forloop ile yapalim dersek
        // adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        for (int i = 1; i < 10000; i++) {
            System.out.println(" toplamak uzere tam sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }
    }
}
