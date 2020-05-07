package com.space.service;

import com.space.model.Book;
import com.space.model.BookType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface BookService {
    Page<Book> getBooksList(Specification<Book> specification, Pageable sortedBy);
    Integer getBooksCount(Specification<Book> specification);
    Book createBook(Book book);
    Book getBook(Long id);
    Long checkId(String id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);

    Specification<Book> selectByName(String name);
    //Specification<Book> selectByPlanet(String planet);
    Specification<Book> selectByBookType(BookType bookType);
    Specification<Book> selectByProdDate(Long after, Long before);
    Specification<Book> selectByUse(Boolean isUsed);
    //Specification<Book> selectBySpeed(Double minSpeed, Double maxSpeed);
    //Specification<Book> selectByCrewSize(Integer minCrewSize, Integer maxCrewSize);
    //Specification<Book> selectByRating(Double minRating, Double maxRating);
}
