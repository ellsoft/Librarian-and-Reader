package org.uysoft.booksforvue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.uysoft.booksforvue.entity.Book;
import org.uysoft.booksforvue.repositories.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController{

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page,
                              @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page, size);
        return bookRepository.findAll(request);
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if(result != null){
            System.out.println("success");
            return "success";
        }else{
            System.out.println("error");
            return "error";
        }
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if(result != null){
            System.out.println("success");
            return "success";
        }else{
            System.out.println("error");
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){
        System.out.println(bookRepository.findById(id).get());
        return  bookRepository.findById(id).get();
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        /*Integer id = book.getId();
        bookRepository.deleteById(id);*/
        bookRepository.deleteById(id);

    }


    @GetMapping("/searchpc/{lowerpc}/{upperpc}")
    public List<Book> findPrice(@PathVariable("lowerpc") Integer lowerpc,
                                  @PathVariable("upperpc") Integer upperpc){
        return bookRepository.findAllByPrice(lowerpc, upperpc);
    }
}
