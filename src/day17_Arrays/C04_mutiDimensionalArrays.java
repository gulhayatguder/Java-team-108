package day17_Arrays;

import java.util.Arrays;

public class C04_mutiDimensionalArrays {
    public static void main(String[] args) {
         int [][]arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);// 5
        System.out.println(arr[2].length);//4
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@7a79be86 refransini yazdirir
        System.out.println(Arrays.toString(arr));//[[I@b684286, [I@880ec60, [I@3f3afe78, [I@34ce8af7, [I@7f63425a]
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]** TUM ELEMENTLER ICIN**
        System.out.println(Arrays.toString(arr[4]));//[1,2,3,4,5]
        System.out.println(arr[4][4]);//5


    }
}
