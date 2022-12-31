package day21_staticKeyWord;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s=20;
        System.out.println(s);//20
       // int si=30; bir scopta tanimlanan variablenin yeniden tanimlanma imkani yoktur
        //String s=" Hasan";  data turunu de degistirsek bu sekilde de kullanmamiza izin vermez

        method1();
    }

    public static void method1(){
        method2(5);
        String s="Hasan";// baska bir metodun icinde ayni isimli baska bir veriable olusturulabilir
        System.out.println(s.toLowerCase());

    }
    public static void method2(int s){
        s=s*s;

    }
}
