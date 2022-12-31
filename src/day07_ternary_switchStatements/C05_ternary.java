package day07_ternary_switchStatements;

public class C05_ternary {
    public static void main(String[] args) {
        /*Bir Ternary Ifadenin sonucunu yazdirdigimizda,
         sart saglanirsa veya saglanmazsa
          yazdirilacak datanin turu onemli olmaz
          Ancak, ternary ifade’nin sonucunu bir variable’a atama yapacaksak,
           sart saglanirsa veya saglanmazsa
           elde edilecek sonucun ayni data turunde olmasi gerekir

        * */

        int sayi=12;
        System.out.println(sayi>10 ? "buyuk sayi" : sayi+2);

      //  int b=sayi>10 ? "buyuk sayi" : sayi+2;

        //String c=sayi>10 ? "buyuk sayi" : sayi+2
    }
}
