package day23_dateTime_varrags;

public class C05_Varargs {
    public static void main(String[] args) {
        topla(5,8);// iki sayinin toplami:  13
        topla(5,6,7);//üc sayinin toplami:  18
        topla(7,3,5,7);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("dört sayinin toplami:  "+(sayi1+sayi2+sayi3+sayi4));

    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("üc sayinin toplami:  "+(sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami:  "+(sayi1+sayi2));
    }
}
