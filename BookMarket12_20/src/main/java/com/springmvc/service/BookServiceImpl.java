package com.springmvc.service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepositoryImpl bookRepository;

    @Override
    public List<Book> getAllBooList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }

    @Override
    public Book getBookById(String bookId) {
        Book bookById = bookRepository.getBookById(bookId);
        return bookById;
    }

    @Override
    public void setNewBook(Book book) {
        bookRepository.setNewBook(book);
    }
}
