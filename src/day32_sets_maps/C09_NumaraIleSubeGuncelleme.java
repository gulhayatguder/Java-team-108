package day32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        // Numarasi verilen ogrencinin sube ismini
        // verilen sube yapan bir method olusturun

   Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.subeDegistirme(ogrenciMap,101,"M");
        ogrenciMap=MapMethodDepo.subeDegistirme(ogrenciMap,102,"S");
        System.out.println(ogrenciMap);

    }
}
