package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfSayilariMap=new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);//{A=10, C=15, D=3, K=5}
        System.out.println(harfSayilariMap.subMap("C", "F"));//{C=15, D=3}
        System.out.println(harfSayilariMap.subMap("C", "K"));//{C=15, D=3} K haric
    }
}
