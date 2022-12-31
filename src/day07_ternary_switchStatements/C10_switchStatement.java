package day07_ternary_switchStatements;

public class C10_switchStatement {
    public static void main(String[] args) {

       //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        int günNo=5;
        switch (günNo){

            case 1:
            case 2:
            case 3 :
            case 4 :
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecersiz gun numarasi");
    }}
}
