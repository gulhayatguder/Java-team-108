package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //collection’daki TUM ELEMENTLERI index veya siralama olmaksizin bize getirir

        //forEach LOop ta 3 seyi belirtmemeiz gerekir
        //   1-getirilecek elemanlarin data turu
        //   2_ getirilen elemente verilecek isim( genelde each/ w kullanilir)
        //   3-

        int[]arr={2,4,6,8,1};

        // bu arrayin tüm elemenlerini getirelim

        for (int each:arr
             ) {
            System.out.print(each + " ");


        }
    }
}
