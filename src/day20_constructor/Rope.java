package day20_constructor;


    public class Rope{
        public static void swing() {
            System.out.println("swing ");
        }
        public void climb() {
            System.out.println("climb ");
        }
        public static void play(){
            swing();
           // climb();
        }
        public static void main(String[] args) {
            Rope rope = new Rope();
            rope.play();
            Rope rope2 = null;// instance veriable yok, instance veriable olsaydi ve  instance ile ilgi islem yapsaydik, null pointer exeption verirdi
            rope2.play();

        }
    }

