package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestetMap {
    public static void main(String[] args) {
        /* {
        Asagidaki body'i Map olarak olusturalim
"firstname" : "Ahmet",
"lastname" : "Bulut",
"totalprice" : 500,
"depositpaid" : false,
"bookingdates" : {
       "checkin" : "2021-06-01",
       "checkout" : "2021-06-10"
          },
"additionalneeds" : "wi-fi" } */

        Map<String, Object> booking = new HashMap<>();
        booking.put("firstname", "Ahmet");
        booking.put("lastname", "Bulut");
        booking.put("totalprice", 500);
        booking.put("depositpaid", false);

        Map<String, String> bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2021-06-01");
        bookingDates.put("checkout", "2021-06-10");
        booking.put("bookingdates", bookingDates);

        System.out.println(((Map) booking.put("additionalneeds", "wi-fi")).get("checkin"));


    }
}
