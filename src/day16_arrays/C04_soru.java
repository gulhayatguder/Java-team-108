package day16_arrays;

import java.util.Arrays;

public class C04_soru {
    public static void main(String[] args) {
        // verilen bir string array'de
        // istenilen bir harfi sildirip null yazdiralim

        String [] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarfler="u";
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].contains(silinecekHarfler)){
                isimler[i]=null;
            }

        }
        System.out.println(Arrays.toString(isimler));//null,null mehmet,akile, said
    }
}
