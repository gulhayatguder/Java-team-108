package day27_overriding;

public class EParent extends DGrandParent{
    @Override
    protected void metod1() {
        System.out.println("P metod1");
    }
    protected void metod2(){
        System.out.println("P metod2");

    }
}
