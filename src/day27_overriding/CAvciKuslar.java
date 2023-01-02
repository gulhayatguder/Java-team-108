package day27_overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar krt1=new CAvciKuslar();
        krt1.hareket();//C
        krt1.beslenme();//C
        krt1.pence();//C
        krt1.gaga();//C
        krt1.kanat();//B
        krt1.solunum();//B
        krt1.cogalma();//B
        krt1.omur();//A

        BKuslar krt2=new CAvciKuslar();

        krt2.hareket();//C
        krt2.beslenme();//C
        //krt2.pence();//C
        krt2.gaga();//C
        krt2.kanat();//B
        krt2.solunum();//B
        krt2.cogalma();//B
        krt2.omur();//A

        AHayvanlar krt3= new CAvciKuslar();
        krt3.hareket();//C
        krt3.beslenme();//C
        //krt3.pence();//C
        //krt3.gaga();//C
        //krt3.kanat();//B
        krt3.solunum();//B
        krt3.cogalma();//B
        krt3.omur();//A



       }
}
