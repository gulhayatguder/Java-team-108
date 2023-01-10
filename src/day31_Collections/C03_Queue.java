package day31_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String> harfler = new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[H, K, B, K]
        //1. indexe H ekleyelim
        // harfler.add();//araya elemen eklenmez. queue özelliginden dolayi araya ekleme olmaz.
        System.out.println(harfler.remove());//H  kuyruk yapisi geregi eklerken sona eklerken ,silme bastan yapilir
        System.out.println(harfler.remove());//K
        System.out.println(harfler.remove("K"));//true
        System.out.println(harfler.element());// B
        System.out.println(harfler);//
        System.out.println(harfler.peek());//B
        Queue<String> karakterler = new LinkedList<>();

        //peek ve element bize ilk elementi getirir

        //System.out.println(karakterler.element());//NoSuchElementException
        System.out.println(karakterler.peek());//null
        System.out.println(harfler.poll());//B
        System.out.println(harfler);//[]
        //System.out.println(karakterler.remove());//NoSuchElementException
        System.out.println(karakterler.poll());//null
        System.out.println(harfler.offer("C"));//true

        System.out.println(harfler);//[C]

    }
    }
