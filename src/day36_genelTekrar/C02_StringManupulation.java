package day36_genelTekrar;

public class C02_StringManupulation {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen kelimenin kac kere gectigini
        // bukup yazdiran bir method olusturalim

        String cumle="Java basladi ve bitti. Java meger ne güzelmis.Ne phyton ne C, Java en iyisi";

        String istenenKelime="ne";
        kullanimSayisiBul(cumle,istenenKelime);
    }

    private static void kullanimSayisiBul(String cumle, String istenenKelime) {
        int kullanimSayisi=0;
        int index=0;

       while (index<cumle.length());
       index=cumle.indexOf(istenenKelime);

    }
}
