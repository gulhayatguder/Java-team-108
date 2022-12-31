package day25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){
        System.out.println("parametresiz  Corolla constructoru calisti");
    }
     ECorolla(String param1){
         System.out.println("String parametreli contructor calisti");
     }
    String model="Corolla";
    String uretimyeri="Turkiye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla();
    }
    }

