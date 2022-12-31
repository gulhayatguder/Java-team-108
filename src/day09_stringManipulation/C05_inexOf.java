package day09_stringManipulation;

public class C05_inexOf {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";
        // str "cok" iceriyor mu

        System.out.println(str.contains("cok"));// true


        //SORU: kullanicidan aldigimiz cümlede "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("cok"));//17
        System.out.println(str.indexOf("kolay"));//21
        System.out.println(str.indexOf("a",5));

        //SORU: 2. "o"un indexini yazdiralim

        //ilk once birinci "o" nun indexini bulup daha sonra 2. "o"yu buluruz

        int ilkOIndexi=str.indexOf("o");


    }
}
