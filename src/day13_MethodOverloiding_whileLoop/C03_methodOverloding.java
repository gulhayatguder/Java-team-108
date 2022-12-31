package day13_MethodOverloiding_whileLoop;

public class C03_methodOverloding {
    public static void main(String[] args) {
        toplama(5.4,6.3);//
        toplama('a','b');

        //%100 uyumlu parametre bulamazsa casting ile calisacak method’lara bakar
        //- casting ile calisacak method birden fazla ise en az casting yapacagini secer

        toplama(8.4,6);

    }

    public static void toplama(int sayi1, double sayi2) {
        System.out.println("int ve double toplama:" + (sayi1 + sayi2));
    }
    public static void toplama(double sayi1, double sayi2) {
        System.out.println("double ve double toplama:" + (sayi1 + sayi2));
    }
}
