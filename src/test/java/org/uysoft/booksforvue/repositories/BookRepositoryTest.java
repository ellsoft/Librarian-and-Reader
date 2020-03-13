package org.uysoft.booksforvue.repositories;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.uysoft.booksforvue.controller.BookController;
import org.uysoft.booksforvue.entity.Book;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void findNameById(){
        System.out.println(bookRepository.findById(1));
        System.out.println("------------------------");
        System.out.println(bookRepository.findById(3));
        System.out.println("------------------------");
        System.out.println(bookRepository.findById(2));
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("Spring boot from ahmatjan");
        book.setAuthor("Ahmatjan.Rawut");
        book.setPublisher("UyCode Press Inc.");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);

    }

    @Test
    void findById(){
       Book book = bookRepository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void deleteById(){
        bookRepository.deleteById(32);
    }


    @Test
    void priceTest(){
        List<Book> books = bookRepository.findAllByPrice(30,80);
        for (Book book: books
             ) {
            System.out.println(book);
        }
    }
}