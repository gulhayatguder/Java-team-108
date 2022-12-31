package day16_arrays;

import java.util.Arrays;

public class C12_sortsiralama {
    public static void main(String[] args) {
        // Verilen bir array'i Natural Order'a göre siralayip yazdirin

        String [] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said","Akile","Said","mahmut"} ;
        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        // eger buyukten kucuge siralamak istersek, once sort
    }
}
