package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping
    public String requestsBookList(Model model){
        List<Book> list =  bookService.getAllBooList();
        model.addAttribute("bookList", list);
        return "books";
    }


    @RequestMapping(value = "/all")
    public ModelAndView requestsAllBookList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Book> list =  bookService.getAllBooList();
        modelAndView.addObject("bookList", list);
        modelAndView.setViewName("books");;
        return modelAndView;
    }


    @GetMapping("/{category}")
    public String requestBooksByCategory(@PathVariable("category") String bookCategory,
                                         Model model){
        List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
        model.addAttribute("bookList", booksByCategory);

        return "books";
    }

    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId, Model model){
        Book bookById = bookService.getBookById(bookId);
        model.addAttribute("book", bookById);
        return "book";
    }

    @GetMapping("/add")
    public String requestAddBookForm(@ModelAttribute("NewBook") Book book){
        return "addBook";
    }

    @PostMapping("/add")
    public String submitAddNewBook(@ModelAttribute("NewBook") Book book){
        bookService.setNewBook(book);
        return "redirect:/books";
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("addTitle", "신규 도서 등록");
    }

}
