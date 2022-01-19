package com.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostingDate {
    private LocalDateTime currentDate = LocalDateTime.now();

    public String getFormattedDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDate = formatter.format(currentDate);
        return formattedDate;
    }

    public PostingDate(){}
}
