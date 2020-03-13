package org.uysoft.booksforvue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooksforvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksforvueApplication.class, args);
        System.out.println("启动服务成功！");
    }

}
