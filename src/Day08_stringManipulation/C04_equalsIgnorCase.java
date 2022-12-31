package Day08_stringManipulation;

public class C04_equalsIgnorCase {
    public static void main(String[] args) {

        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";
        String str4 = "paZar";

        System.out.println(str1==str2);// false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println("================");

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));// false
        System.out.println(str1.equals(str3));// false

        //
        //          Eger iki metni KARSILASTIRIRKEN buyuk harf-kucuk harf duyurliligi (case sensitive)
        //          onemsiz ise o zaman

        //          equalsIgnoreCase() kullanilir
        //

        System.out.println(str1.equalsIgnoreCase(str2));// true
        System.out.println(str1.equalsIgnoreCase(str3));// true
        System.out.println(str1.equalsIgnoreCase(str3));// true
    }
    }
