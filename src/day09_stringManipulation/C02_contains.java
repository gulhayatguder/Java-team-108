package day09_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        //******** cok kullanilan bir metot
        //Bir String’in baska bir String’i icerip icermedigini kontrol eder, boolean sonuc döndürür.
        //Aranan String’in kac tane oldugunu tespit edemez, sadece var veya yok cevabi verir

        String str= "Java ogren, mutlu ol";
        // str mutlu icerir
        System.out.println(str.contains("mutlu"));//true

        // charSequence: char dizisi

        System.out.println(str.contains("J"));// true
        System.out.println(str.contains(""));// true

        System.out.println(str.contains("Java") &&  str.contains("mutlu"));
    }
}
