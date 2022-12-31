package day25_inheritance;

public class APersonel {
    protected String isim="Isim atanmadi";
   protected String soyisim="Soyisim atanmadi";
   protected String telefon="Telefon atanmadi";

    public void maas(){
        System.out.println("Hastanemisin asgari ucreti....");
    }
    public void ozelsigorta() {
        System.out.println("Tüm personelin ozel saglik sigortasi var");

    }private void özelmethod(){
        System.out.println("Özel metot");
    }
}
