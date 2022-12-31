package day13_MethodOverloiding_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // iki basamakli sayilardan 7 ile bölünebilenleri yazdirin

        //+++++++++++++ forLoop ile ********+
        for (int i = 10; i < 100; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");

        //************ while loop ile ************
        int sayi=10;
        while (sayi<100){
            if (sayi%7==0){

            }sayi++;
        }
    }
}
