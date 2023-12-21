package com.springmvc.service;

import com.springmvc.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooList();
    List<Book> getBookListByCategory(String category);

    Book getBookById(String bookId);

    void setNewBook(Book book);

}
