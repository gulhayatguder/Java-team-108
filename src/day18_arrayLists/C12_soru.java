package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_soru {
    public static void main(String[] args) {
        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    }

    public static List<Integer> fibonacciListesiOlustur() {

        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kac tane fibonacci sayisi istediginizi giriniz");
        int n = scan.nextInt();

        //  fibonacci sayilari: 0,1,1,2,3,5,8,13,21,34,55,.....

        if (n < 1) {
            System.out.println("gecersiz sayi");
        } else if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0,1");
        } else {

        }


        return fibonacciList;
    }
}
