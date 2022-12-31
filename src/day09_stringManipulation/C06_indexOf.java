package day09_stringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
      //  SORU: kullanicidan aldigimiz cümlede "cok" ile baslayan ilk kelimeyi yazdirin
        // cumlede "cok" kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();

        // sinavlarimizda coktan secmeli sorular kullaniyoruz
        // Javayi cok seviyoruz
        // bu kadar coklu secenek olur mu?
        if (!cumle.contains("cok")) System.out.println("cumlede cok ile baslayan kelime yok");
        else {

        }
    }
}
