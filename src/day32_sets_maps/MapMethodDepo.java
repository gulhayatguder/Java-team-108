package day32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
    // bize ogrenciMap donduren bir method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-H-MF");

        return ogrenciMap;
    }


    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMap.values();

        // 2- for-each kullanarak her bir value'yu ele alalim  Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim 0.index
        // 5- eger value'den aldigimiz isim, aranan isim ile ayni ise
        //    true dondurup, for-each'i bitirelim
        // 6- for-each bittiginde true olmadiysa false dondurelim

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }

        }
        return false;


    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        // 1- map'deki value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        // listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("Isim  Soyisim  Sinif Sube");

        // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value'yu - ile split yapip bir array elde edelim [Ali, Can, 11, H, MF]
        // 4- array'in 1.index'indeki soyisme bakip, aranan soyisim ile ayni ise
        //    isim, soyisim, sinif ve sube bilgilerini yazdiralim

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + "  " +
                        valueArr[1] + "  " +
                        valueArr[2] + "  " +
                        valueArr[3]);
            }

        }


    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valueCollections = ogrenciMap.values();
        System.out.println("Isim  Soyisim  Sinif Sube");
        for (String eachvalue : valueCollections
        ) {
            String[] valueArr = eachvalue.split("-");
            String valuesinif = valueArr[2];
            String valuesube = valueArr[3];

            if (valuesinif.equalsIgnoreCase(sinif) && valuesube.equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + "    " +
                        valueArr[1] + "    " +
                        valueArr[2] + "    " +
                        valueArr[3]);
            }

        }

    }

    public static Map<Integer, String> subeDegistirme(Map<Integer, String> ogrenciMap, int numara, String yeniSube) {

        //1- Okul numarasini biliyoruz, direk ogrenci value ulasabiliriz
        String ogrencivalue=ogrenciMap.get(numara);
        String[]valueArr=ogrencivalue.split("-");
        // 2-Sube ismini guncelleyelim
        valueArr[3]=yeniSube;
        // 3- Array deki guncel bilgileri yeniden value formatinda bir  string yapalim
        String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]+"-";
        // ogrenci no yani key ile yeni value yu map'e ekleyelim
        ogrenciMap.put(numara,yeniValue);
        return ogrenciMap;
    }


    public static void siniflistesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        //Verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir metod olusturalim

        System.out.println("No Isim  Soyisim  Bolum");
        System.out.println("=========================");

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            //1-Entry'den  value'yu alalim
            String entryvalue=eachEntry.getValue();//Ali-Can-11-H-MF
            //2- Bu value 'yu parcalayalim ve bir array'e stor edelim
            String[] valuArr=entryvalue.split("-");//[Ali,Can,11,H,MF]
            //3-Sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim
            if (valuArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey()+" "+
                        valuArr[0]+" "+
                        valuArr[1]+" "+
                        valuArr[4]);
            }

        }



    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {

        //Verilen bolumdeki ogrencilerin No, isim, soyisim ve
        // siniflarini yazdiran bir metot olusturalim

        System.out.println("No Isim  Soyisim  Sinif");
        System.out.println("=========================");
        Set<Map.Entry<Integer,String>>entrySeti= ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            String entryValue=eachEntry.getValue();
            String[] entryArr=entryValue.split("-");
            if (entryArr[4].equalsIgnoreCase(bolum)){
                System.out.println(eachEntry.getKey()+" "+
                        entryArr[0]+" "+
                        entryArr[1]+" "+
                        entryArr[2]);
            }
        }

    }


}