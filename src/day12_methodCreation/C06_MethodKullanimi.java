package day12_methodCreation;

public class C06_MethodKullanimi {
    public static void main(String[] args) {
        // verilen bir String'i terse cevirip o halini bize donduren bir method olusturalim-


        String str="java candir";




    }
    public static String metniTerseCevir(String str){

        String tersStr="";
        for (int i =str.length()-1; i>=0; i--) {
            tersStr +=str.charAt(i);

        } return tersStr;

    }
}
