package Day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str="Java güzeldir";// 13karakter var

        // java da index 0 'dan baslar
        // j==0. index
        //r==12. index
        // charAt (index) ile istedigimiz index'deki char'a ulasabiliriz

        // ilk harf'i yazdiralim
        System.out.println(str.charAt(1));

        // sondan 2. karekteri yazdiralim
        System.out.println(str.charAt(13-2));

        //sondan 4. karekteri  buyuk harfle yazdiriniz


        System.out.println(str.toUpperCase().charAt(13-4));//L
        // charAt() method'u bize char döndürdügü icin toUppercase() calismaz
        // String method'larini charAt() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz


        // System.out.println(str.charAt(18)); // StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir


    }
}
