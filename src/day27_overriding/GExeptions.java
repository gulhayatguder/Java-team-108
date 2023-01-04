package day27_overriding;

public class GExeptions {
    public static void main(String[] args) {
        int a=20;
        int b=0;

        // Böle sayini 0 olmasi bu kodda öngörulebilecek bir riskdir ve
        // kodumuzu yazarken bu riski cozecek sekilde kon yazabiliriz

        if (b!=0){
            System.out.println("Iki sayininb bolümü: "+ a/b);
        }
        else System.out.println("Bölecek sayi 0 olmamalidir");

    }
}
