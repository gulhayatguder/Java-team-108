package day17_Arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {
        String str=" java her gecen gün güzellesiyor";
        // str da kac kelime var
        //split methodu istedigimiz Stringi
        // istedigimiz ayirac kullanarak parcalara ayirmamiza imkan verir
        String[] spaceSplit=str.split("e");
        System.out.println(Arrays.toString(spaceSplit));//[ java h, r g, c, n gün güz, ll, siyor]
    }
}
