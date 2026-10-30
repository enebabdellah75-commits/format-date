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



    }
}
