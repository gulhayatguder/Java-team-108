package day10_stringManipulations;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="    ";
        String srt3;
        String str4=null;
        System.out.println(str1.length());//0
        System.out.println(str2.length());//4
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//fals
        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        // null bir deger degil isaretcidir(null pointer)
        //null pointer; non primitiv bir objenin olusturuldugunu ancak bilincli olarak deger atanmadigini isaretler



    }
}
