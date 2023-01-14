package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.get(101));
        System.out.println(ogrenciMap.getOrDefault(103, "ogrenci bulunamadi"));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(113, "ogrenci bulunamadi"));//ogrenci bulunamadi
        System.out.println(ogrenciMap.get(113));//null
        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-TM"));//Ali-Cem-11-K-TM...... aslinda put'da aynisini yapar ama olmayan bir eleman da put ekler replace null yazdirir
        System.out.println(ogrenciMap.replace(123, "Ali-Cem-11-K-TM"));//null
        System.out.println(ogrenciMap.replace(103, "Ali-Cem-11-K-TM", "Ali-Han-11-K-MF"));//true
        //eski degeri verilen ile replace eder

    }
}
