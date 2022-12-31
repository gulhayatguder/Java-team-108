package day25_inheritance;

public class BDoktor extends APersonel {
    public static void main(String[] args) {
        BDoktor dok1=new BDoktor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut";
        dok1.telefon="123456778";
        System.out.println(dok1.isim+dok1.soyisim+dok1.telefon);
      dok1.maas();
      dok1.ozelsigorta();
    }
    public void maas(){
        System.out.println("Doktor maasi.....");

    }
    public void nöbet(){
        System.out.println("Bütün doktorlar haftada bir ");
    }
}
