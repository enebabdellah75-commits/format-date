package com.plularsight.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime today = LocalDateTime.now();

        // Display the current date and time
        System.out.println(today);

        // Format the date as MM/dd/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Convert the date into the desired format
        String formattedDate = today.format(formatter);

        // Display the formatted date
        System.out.println(formattedDate);

        // Format the date as yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convert the date into the desired format
        String formattedDate2 = today.format(formatter2);

         // Display the formatted date
        System.out.println(formattedDate2);

        // Format the date with the full weekday and month names
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        // Convert the date into the desired format
        String formattedDate3 = today.format(formatter3);

        // Display the formatted date
        System.out.println(formattedDate3);



    }
}
