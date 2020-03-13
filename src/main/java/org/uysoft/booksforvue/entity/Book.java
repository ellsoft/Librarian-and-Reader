package org.uysoft.booksforvue.entity;

import lombok.Data;
//import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String author;
    private String publisher;
    private String picture;
    private Integer price;
    private String details;
    private String category;


}
