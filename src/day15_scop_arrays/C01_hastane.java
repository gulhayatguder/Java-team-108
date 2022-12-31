package day15_scop_arrays;
public class C01_hastane {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /* Eger tum method'lardan kullanilabilecek variable'lar olusturmak isterseniz
           bu variable'lari class level'da olustururuz
           Class level'da olusturulacak variable'lar icin 2 ihtimal vardir
           1- static variable (Class variable)
           2- instance(static olmayan) variable ( obje variable)
           Kural1- static variable'lar tum objeler icin tek bir deger alir
                   instance variable'lar her obje icin java tarafindan cogaltilir

           Kural2-class level variable'lara deger atamasak da kullanabiliriz
                  biz deger atamasakl bile java class level variable'lara default degerler atar
                  non-primitive ==> null (String)
                  sayisal primitive ==> 0
                  char ==> hiclik ''
                  boolean ==> false

         */

    }
}
