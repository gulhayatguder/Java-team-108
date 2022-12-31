package day07_ternary_switchStatements;

public class C11_switchCase {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        char harf='S';
        switch (harf){

            case 'i':
            case 'I':
                System.out.println("International");
            case 's':
            case 'S':
                System.out.println("Software");
            case 't':
            case 'T':
                System.out.println("Testing");
            case 'q':
            case 'Q':
                System.out.println("Qualifications");
            case 'b':
            case 'B':
                System.out.println("Board");
            default:
                System.out.println("yanlis harf secimi");


        }
    }
}
