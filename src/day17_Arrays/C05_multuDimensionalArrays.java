package day17_Arrays;

public class C05_multuDimensionalArrays {
    public static void main(String[] args) {
        int [][]arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        // verilen MDA'daki tüm sayilarn toplamini yazdiran bir metod olusturun
       tümsayilariTopla(arr);
    }
    public static void tümsayilariTopla( int[][]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {// outer Array icin
            for (int j = 0; j <arr[i].length ; j++) {//inner Array' ler icin
                toplam+=arr[i][j];
            }
        }
        System.out.println("tüm sayilarin toplami; "+toplam);
    }
}
