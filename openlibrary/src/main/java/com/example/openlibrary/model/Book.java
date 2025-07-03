package com.example.openlibrary.model;


import lombok.Data;
import java.util.List;

@Data
public class Book {
    private String title;
    private List <String> author_name;
    private int first_publish_year;
}