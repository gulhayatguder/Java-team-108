package day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    // Verilen bir Array deki tekrar eden elemanlari
    // sadece bir kere yazarak Array'i kisaltan bir kod yazalim
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,4,5,1,2,3,6,4,1,2,3,4,1,2,3};
        Set<Integer>arrSet=new HashSet<>();
        // Arraydeki tum elementleri Set'e ekleyelim
        for (int each:arr
             ) {
          arrSet.add(each);

        }System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]
        //Seti tekrar Array'a atamaliyiz.
        //Setteki eleman sayisina esit bir Array olusturup
        //Setteki elementleri oraya tasiyalim

        arr=new int[arrSet.size()];//[0,0,0,0,0,0]
        int index=0;
        for (int each: arrSet
        ) {
            arr[index]= each;
            index++;
        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));


    }
}
