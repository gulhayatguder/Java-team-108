package day21_staticKeyWord;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main metod calismaya basladi");
    }
    static {
        System.out.println("statik block calisti");//- Static bloklar tum class uyelerinden, main method’dan bile once calisir

       /*Static bloklar class ilk calistirildigi anda calisir ve
       class’in baslangic degerlerini olusturur(initiliaze
       main metod calismadan önce yapilmasi gereken islem oldugunda kullanilir
       sifre almak gibi
       * */
    }
}
