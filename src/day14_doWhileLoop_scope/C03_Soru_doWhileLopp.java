package day14_doWhileLoop_scope;

public class C03_Soru_doWhileLopp {
    public static void main(String[] args) {
        // verilen baslangic ve bitis karakterleri dahil
        // aradki tum karakterleri yazdirin

        char baslangic='d';
        char bitis='m';

        do {
            System.out.print(baslangic);
            baslangic=(char)(baslangic+1);

        }while (baslangic<=bitis);
    }
}
