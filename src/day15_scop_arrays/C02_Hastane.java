package day15_scop_arrays;

public class C02_Hastane {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {
         C02_Hastane per1=new C02_Hastane();

         C02_Hastane per2=new C02_Hastane();
         per1.personelIsmi="Harun";
         per2.personelAdresi="Cankaya";

        System.out.println(per1.personelTel);// telefon
        System.out.println(per1.personelIsmi);
        per2.personelIsmi="Mehmet";

    }
}
