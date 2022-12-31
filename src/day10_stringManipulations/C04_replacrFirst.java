package day10_stringManipulations;

public class C04_replacrFirst {
    public static void main(String[] args) {
        String str=" Java heyecandir";
        // eger tum a'lari degilde sadecailk a'yi degistirmak istersek

        System.out.println(str.replaceFirst("a","A"));// JAva heyacandir
        // ilk harf vaya rakmi * yap
        System.out.println(str.replaceFirst("\\w","*"));

    }
}
