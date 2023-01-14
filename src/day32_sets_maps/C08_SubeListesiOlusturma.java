package day32_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    // verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun
    public static void main(String[] args) {
       Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
       MapMethodDepo.subeListesiYazdirma(ogrenciMap,"11","H");
       MapMethodDepo.subeListesiYazdirma(ogrenciMap,"10","k");
    }





}

