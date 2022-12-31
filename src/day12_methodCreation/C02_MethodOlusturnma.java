package day12_methodCreation;

public class C02_MethodOlusturnma {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip sonucu yazdiran bir method olusturun
        // methodlar clasin icinde ama main methodun disinda olusturulur

        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir

        carpyazdir(5.8,8.6);
        carpyazdir(6,8);
    }
    public static void carpyazdir(double sayi1,double sayi2){
        System.out.println(sayi1*sayi2);

        // bu method verilen iki sayiyi carpip sonucu yazdirir

    }
}
