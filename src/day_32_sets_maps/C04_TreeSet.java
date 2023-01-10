package day_32_sets_maps;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {
    public static void main(String[] args) {
        Set<Integer> sirali=new TreeSet<>();
        sirali.add(13);
        sirali.add(11);
        sirali.add(5);
        sirali.add(67);
        System.out.println(sirali);//[5, 11, 13, 67]
    }
}
