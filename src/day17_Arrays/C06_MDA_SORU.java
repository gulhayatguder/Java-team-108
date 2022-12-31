package day17_Arrays;

public class C06_MDA_SORU {
    public static void main(String[] args) {
        //Verilen iki katliString bir array de
        // istenilen metni yazdiran bir metod olusturun

        String[][]arr={{"Ali","zafer"},{"betul","Hüseyin","hasan"},{"said"}};
        String arananMetin="a";
        istenenElementleriYazdir(arr,"e");
        istenenElementleriYazdir(arr,"a");
        istenenElementleriYazdir(arr,"Ali");
        istenenElementleriYazdir(arr,"");

    }
    public static void istenenElementleriYazdir(String[][]arr,String arananMetin){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].contains(arananMetin)){
                    System.out.println(arr[i][j]);
                }

            }


        }System.out.println("");
    }
}
