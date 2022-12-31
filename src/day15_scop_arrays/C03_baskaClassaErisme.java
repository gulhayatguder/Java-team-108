package day15_scop_arrays;

public class C03_baskaClassaErisme {
    public static void main(String[] args) {
        /*
        *  Java OOP konsept cercevesinde baska klaslardaki class uyelerini(variable/method)
        * kullanabiliriz*/

        System.out.println(C01_hastane.hastaneAdres);
        System.out.println(C01_hastane.hastaneismi);
        C01_hastane per1=new C01_hastane();
        System.out.println(per1.personelAdresi);
        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.hastaneAdres="Uskudar";
        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.personelTel);
        System.out.println(per1.hastaneismi);
    }
}
