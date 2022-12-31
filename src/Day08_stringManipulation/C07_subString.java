package Day08_stringManipulation;

public class C07_subString {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());// karakter sayisi 19

        // metnin tam ortasindaki karakter nedir
        System.out.println(str.charAt(str.length()/2));// n

        // son karekteri yazdiralim
        System.out.println(str.charAt(str.length()-1));//p


        // bir karakteri degilde verilen string'in bir metin parcasini elde etmek istersek
       // "ogren " kelimesini yazdiralim

        System.out.println(str.substring(5, 9));// ogre
        //


        System.out.println(str.substring(5,10));//


        //  str'dan "java" kelimesini yazdiralim

        System.out.println(str.substring(0,4));// java

        //str'dan "kap" kelimesini yazdiralim
        System.out.println(str.substring(16,19));// kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        // substring kullanarak sadece "j "  harfini yazdiralim

        System.out.println(str.substring(0));
        System.out.println(str.substring(0,1));

        System.out.println(str.substring(9,10).toUpperCase());//
        System.out.println(str.toUpperCase().charAt(9));
        System.out.println(str.substring(5,5));// 5 'ten baslayip 5'te biter dolayisiyla hiclik yazdirir

        System.out.println(str.substring(4,3));// hata verir
        System.out.println(str.substring(25,28));//StringIndexOutOfBoundsException uyarisi verir sinirlari astiniz uyarisi








    }
}
