package day23_dateTime_varrags;

public class C06_Varargs {
    public static void main(String[] args) {
        //Öyle bir metot olusturalim ki ,
        // kac tane argument yazarsam yazayim, argumentlerin toplamini versin

        topla(5,6);
        topla(4,5,6,7);
        topla(1,2,3,4,5,6);
        topla(1,4,5,6,7,8,9,6,5,4,2,1,3,5);
        /* Varargs array alt yapisini kullanir
        * temel hedef*/
    }

    private static void topla(int... sayilar) {
        int toplam1=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam1+=sayilar[i];

        }
        System.out.println(toplam1);
        int toplam2=0;
        for (int each:sayilar
             ) {
            toplam2+=each;

        }
        System.out.println(toplam2);
    }
}
