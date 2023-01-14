package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntySet {
    public static void main(String[] args) {
        //tum ogrencileri 101= Ali-Can-11-H-MF  seklinde yazdirin
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-H-MF}

        System.out.println("No= Ogrenci Bilgileri");
        System.out.println("=================================");

        //once oörenci numaralarini alalim
        Set<Integer>ogrenciNoSeti=ogrenciMap.keySet();
        //System.out.println(ogrenciNoSeti);//[101, 102, 103, 104, 105, 106]

        for (Integer eachKey :ogrenciNoSeti
             ) {
            System.out.println(eachKey+"= "+ogrenciMap.get(eachKey));

            /*  Aslinda bizden istenen Map'in icindeki her bir element.
            * Java  Map'teki her iki elementleri key-value ikilisi olarak
            *  BIRLIKTE alabilmemiz icin ENTRY class'ini olusturmustur
            *  entry'ler de map ile ayni data yapisina sahip olmalidir
            * ornegin  ögrenci map'ini dusunursek entry'ler
            *   Entry<Integer,String>*/



        }System.out.println("*************************************");

        Set<Map.Entry<Integer,String>>ogrencientrySet=ogrenciMap.entrySet();
        System.out.println("No= Ogrenci Bilgileri");
        System.out.println("=================================");

        for (Map.Entry<Integer,String>eachEntry:ogrencientrySet
        ) {
            System.out.println(eachEntry);
        }


    }
}
