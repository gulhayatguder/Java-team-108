package day31_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        // Deque double ended queue demektir
        // yani iki yonlu kuyruk
        // Bu iki yonlu yapisindan dolayi pek cok metodun First() ve last() versiyonu vardir

        // özellikle söylenmezse sona ekler
        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");
        System.out.println(harfler);//
        harfler.addFirst("B");//B
        System.out.println(harfler);//[B, J, L]
        System.out.println(harfler.removeFirst());//B
        System.out.println(harfler);
        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler);
        //Sona dogru olan  A yi silelim
        System.out.println(harfler.removeLastOccurrence("A"));//true
        System.out.println(harfler);//[A, J, L, K]
        System.out.println(harfler.removeFirstOccurrence("T"));//false

        LinkedList<String>karakterler=new LinkedList<>();

        // push addFirst ile ayni (basa ekler)
        karakterler.push("A");
        karakterler.push("B");
        System.out.println(karakterler);//[B, A]
        System.out.println(karakterler.hashCode());
    }
}
