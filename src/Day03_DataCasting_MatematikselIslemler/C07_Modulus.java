package Day03_DataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {
        //Java’da Modulus islemi, bir bolme islemindeki kalan sayiyi bize verir
        System.out.println(15%4);//3
        System.out.println(45%4);//1
        //Modulus islemi sayesinde
        //- Cift sayilar ( sayi %2 )
        //- Bir sayinin birler basamagini bulma ( sayi %10 )
        //- Bir sayi (ornegin 5) ile tam bolunebilen sayilari bulma ( sayi % 5 )
        //mumkun olmaktadir

        //

        int girilenSayi=3426;
        int birlerBasamagi=3426%10;// 6
        System.out.println("birler basamagi:"+birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//342



    }
}
