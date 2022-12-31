package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="Ja1va 56Guz,el-dir";
        // bu metindeki sayilardan kurtulun
        System.out.println(str.replace("1",""));
        System.out.println(str.replace("5",""));
        System.out.println(str.replace("6",""));

        str="Ja1va4 56G7uz,z9el-d0ir8";
        //replace()  metodu zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar.
        // eger genellemeyi butun sayilari, butun space'leri, butun özel karakterler,... gibi genisletmek istersek
        //replace() metodu yerine replaceAll() metodunu kullaniriz.

        // butun bu genellemeler yerine regex(regular exp)



        // özel karakterlerden



    }
}
