package day21_staticKeyWord;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {
        int [] arr={3,6,9,1,7};
        // Bir metod olusturup arr yi metoda yollayalim
        // metoddda array'in elementleri üzerinde degisiklik yapip array' i yazdiralim

        elemenleriDegistir(arr);

    }public static void elemenleriDegistir(int[]b){
        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));//[13, 6, 19, 1, 7]
    }
}
