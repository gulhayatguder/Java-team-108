package day21_staticKeyWord;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {
        int[] arr={3,6,8};
        // Bir metod olusturalim . Metodda array'e 5 elementli bir array  atayalim ve yazdiralim
        //main metoda dondukten sonra sonra array#i yazdiralim

    }
    public static void arrayiDegistir(int[]b){
        b=new int[5];
        System.out.println(Arrays.toString(b));//[0,0,0,0,0]
    }
}
