package day11_forLoops;

public class C07_terseCevirme {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin
        // - Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        String str= "Java ogrenmek icin cok calismak lazim";
        String terstenStr="";

        for (int i = str.length()-1; i >= 0; i--) {
            terstenStr += str.substring(i,i+1);
        }
        System.out.println("Girilen cumlenin tersten yazilisi : " + terstenStr);
        //Girilen cumlenin tersten yazilisi : mizal kamsilac koc nici kemnergo avaJ
    }
}
