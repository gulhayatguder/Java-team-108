package day23_dateTime_varrags;

public class C07_Varargs {
    public static void main(String[] args) {
        //Kac tane String argument yazilirsa yazilsin
        // argumentlerin en uzun olanini yazdiran bir metod olusturun
        // Not: en uzun kelime olarak birden fazala kelime varsa ilkini yazdirsin

        enUzunuyzdir("ilyas","Berivan","murat");
        enUzunuyzdir("mehmet","Vahit","Nurcan","java","zafer","Abdullah");
    }

    private static void enUzunuyzdir(String...kelimeler) {
        String enUzunKelime=kelimeler[0];
        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){// >enuzun kelime.........ilk en uzunu yazdirir/>=enuzun kelime..........son en uzunu yazdirir
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}
