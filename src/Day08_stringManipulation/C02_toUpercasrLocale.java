package Day08_stringManipulation;

import java.util.Locale;

public class C02_toUpercasrLocale {
    public static void main(String[] args) {
         String str= "JAVA CANDIR";
        System.out.println(str.toLowerCase());//java candir
        str=str.toLowerCase(Locale.GERMAN);
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));

        str="sevgi insani hayata baglar";
        System.out.println(str.toUpperCase());
        str=str.toLowerCase(Locale.forLanguageTag("tr"));


    }
}
