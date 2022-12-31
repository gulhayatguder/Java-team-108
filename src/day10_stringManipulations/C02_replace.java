package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str = "Java ogren, adana ye :)";
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("Java", "yazilim"));

        String strr = "Java ogren, adana ye :)";
        System.out.println(strr.replace('a', 'A')); // JAvA ogren, AdAnA ye :)
        System.out.println(strr.replace(" ", "")); // Javaogren,adanaye:)
        System.out.println(strr.replace("Java", "Yazilim")); // Yazilim ogren, adana ye :)
        String telefon = "555 3451234";
        System.out.println(telefon.replace("555", "532")); // 532 3451234
        System.out.println(telefon.replace('3', '7')); // 555 7451274

        System.out.println("****************************");

        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin
        String sonuc = "1-16 of over 100,000 results for \"apple\"";

        int indexOver=sonuc.indexOf("over")+4;
        int indexResults=sonuc.indexOf("result")-1;
        System.out.println(sonuc.substring(indexOver,indexResults));
        System.out.println(sonuc.replace(",","").substring(indexOver,indexResults));



        }


    }
