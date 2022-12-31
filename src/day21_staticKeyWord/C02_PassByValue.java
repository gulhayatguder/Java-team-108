package day21_staticKeyWord;

public class C02_PassByValue {
    public static void main(String[] args) {

        /* Java passBYValue yi kullanilir. Yani metotlar arasinda gönderilen variable degil value(degerleri) dir*/
         int fiyat=100;
         // fiyat uzerinden %10 indirim yapip indirimli fiyati döndüren  bir metod olusturalim
        System.out.println(indirimYap10(fiyat));//90
        System.out.println(indirimYap10(fiyat));//90........ eger degerleri degilde veriableyi goturse idik fiyat devamli dusecekti
        System.out.println(indirimYap10(fiyat));//90
        System.out.println(fiyat);//100

    }


    public static int indirimYap10(int fiyat){
        fiyat=fiyat*90/100;
        return fiyat;
    }
}
