package day22_immutableClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ltd=LocalDateTime.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern(" DDD MM.dd.YYYY EEEE  HH m");
        System.out.println(ltd.format(format1));
    }
}
