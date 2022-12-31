package Day08_stringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gun dahada guzellesiyor, degil mi";
        // sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));

        //toplam karakter sayisi
        System.out.println(str.length());//

        // Rasgele bir karakteri yazdiralim

        Random rnd= new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index= rnd.nextInt(str.length()); // str.length()'den kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));

    }
}
