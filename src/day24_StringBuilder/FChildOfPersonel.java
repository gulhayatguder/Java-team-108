package day24_StringBuilder;

import day25_inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {
        FChildOfPersonel obj1=new FChildOfPersonel();
        obj1.ozelsigorta();
        obj1.maas();
        System.out.println(obj1.isim);
        System.out.println(obj1.soyisim);
        System.out.println(obj1.telefon);

    }
}
