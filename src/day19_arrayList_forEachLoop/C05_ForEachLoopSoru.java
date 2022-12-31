package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoopSoru {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int []arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list=new ArrayList<>();
        for (Integer each:arr
             ) {
            if (!list.contains(each)){
                list.add(each);
            }

        }
        // list olarak unique degerlerden  olusan bir list olusturduk
        arr= new int[list.size()];
    }
}
