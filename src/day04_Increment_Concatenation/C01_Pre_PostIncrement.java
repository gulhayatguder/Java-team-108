package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        // sayiyi once yazdirin sonra bir azaltin
        System.out.println(sayi);

        sayi=10;
        System.out.println(sayi++);
        // bu satida iki islem var, hem yazdirma hem artirma
       //(sayi++) Once sayiyi yazdirir (10) , sonra degeri artirir (11)
        System.out.println(sayi);
        //Ust satirda deger (11) oldu, (11) yazdirir.


        sayi=10;
        System.out.println(++sayi);
        //Once sayiyi artirir (11) , sonra yazdirir (11)
        System.out.println(sayi);
        //Ust satirda deger (11) oldu, (11) yazdirir.
    }
}