package file;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static void main(String[] args) {
        // Get the current date and time
        ZonedDateTime now = ZonedDateTime.now();

        // Define date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Convert to Chicago timezone
        ZonedDateTime chicagoTime = now.withZoneSameInstant(java.time.ZoneId.of("America/Chicago"));
        System.out.println("Chicago time: " + formatter.format(chicagoTime));

        // Convert to Sydney timezone
        ZonedDateTime sydneyTime = now.withZoneSameInstant(java.time.ZoneId.of("Australia/Sydney"));
        System.out.println("Sydney time: " + formatter.format(sydneyTime));
    }
}
