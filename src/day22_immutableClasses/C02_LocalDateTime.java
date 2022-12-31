package day22_immutableClasses;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);
        ldt.getDayOfMonth();
        System.out.println(ldt);
    }
}
