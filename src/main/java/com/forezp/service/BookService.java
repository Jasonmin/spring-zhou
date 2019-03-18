package com.forezp.service;

import com.forezp.dao.BookMapper;
import com.forezp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book>getBookList() {

        return bookMapper.getBookList();
    }

    public Book findBookById(int id) {
        return bookMapper.findBook(id);
    }

    public int addBook(String title,double price) {
        return bookMapper.addBook(title,price);
    }
}
