package day13_MethodOverloiding_whileLoop;

public class C02_MethodOverloding {
    public static void main(String[] args) {
        String str = " Java cok güzel";
        // eger sectigimiz isimde birden fazla method varsa buna Overloding denir
        // ve ayni isimdeki methotlardan hangisinin calisacagina argument/parametre uyumu karar verir.

        toplama(5, 6);//11

        // java ayni class icerisinde ayni isim ve ayni data turunden parametre sayisi ile 2 metod olusturmaya izin vermez
        //1-

        toplama(6,6);//12
        toplama(4.5,5);//9,5
        toplama(4.5,6.7);//11,2
    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("iki tam sayinin toplami:" + (sayi1 + sayi2));


    }
    public static void toplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("üc tam sayinin toplami:" + (sayi1 + sayi2 + sayi3));


    }
    public static void toplama(double sayi1, int sayi2) {
        System.out.println("double ve int toplama:" + (sayi1 + sayi2));
    }
    public static void toplama(int sayi1, double sayi2) {
        System.out.println("int ve double toplama:" + (sayi1 + sayi2));
    }
    public static void toplama(double sayi1, double sayi2) {
        System.out.println("double ve double toplama:" + (sayi1 + sayi2));
    }
}