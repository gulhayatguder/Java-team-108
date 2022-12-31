package day16_arrays;

import java.util.Arrays;

public class C11_Odev {
    public static void main(String[] args) {
        //Kullanicidan yeni isimler alip var olan bir Array'e ekleyen bir metot olusturalim
        // kullanici yeni deger verdigi muddetce c10'daki metodu kullanarak eklemeye devam edin
        //kullanici q'a babastiginda, Array'in son halini döndürün

        String[] isimler = {"ali", "Veli", "Cem"};
        String eklenecekIsim = "Kemal";
        isimler = arrayeElementEkleme(isimler, eklenecekIsim);
        System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Cem, Kemal]

    }

    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekEleman) {
        String[] temp = new String[eklenilecekArray.length + 1];

        for(int i = 0; i<eklenilecekArray.length;i++)

    {
        temp[i] = eklenilecekArray[i];


    }

    temp[temp.length -1]=eklenecekEleman;
        return temp;


    }
}
