package day10_stringManipulations;

public class C06_soru {
    public static void main(String[] args) {
        // Kullanicidan bir cumle alin
        // cumlede ev geciyorsa, "home home sweet home" yazdirin
        //  cumlede is geciyorsa, "calismak guzeldir"
        //  ikisini de iceriyorsa "Hem ev lazim hem is"
        //  hicbirini icermiyorsa "cok calisman lazim" yazdiri
        String str="evden calisiyorum, ise gitmaye gerek yok";
        String calisilacakStr=str.toLowerCase();

        if (calisilacakStr.contains("ev")&& calisilacakStr.contains(" is")){
            System.out.println("Hem ev lazim hem is");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (calisilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");

        }else System.out.println("cok calisman lazim ");
    }
}
