package day16_arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        //binary tree java'nin kullandigi ozel bir siralama yontemidir
        // binarySerch metodu binaryTree ozelligini kullandigindan
        //sirali olmayan Array lerde dogru sonuc  döndürme

        int []arr={2,6,9,3,15,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]
        System.out.println(Arrays.binarySearch(arr, 3));//2  (3'ün yerinin 2'dir)


    }
}
