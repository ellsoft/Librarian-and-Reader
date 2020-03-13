package org.uysoft.booksforvue.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.uysoft.booksforvue.entity.Book;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BookRepository  extends JpaRepository<Book, Integer> {

    @Query(value = "select * from book where price between :lowestPrice and :upperPrice",
            nativeQuery = true)
    List<Book> findAllByPrice(@Param("lowestPrice") Integer lowestPrice,
                               @Param("upperPrice") Integer upperPrice);
}
