package com.mysql.service;

import com.mysql.dao.BookMapper;
import com.mysql.entity.Book;
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

    public List<Book>getPageBook(int pageIdx, int pageSize) {
        int pageCount = pageIdx*pageSize;
        return bookMapper.getPageBook(pageCount,pageSize);
    }

    public Book findBookById(int id) {
        return bookMapper.findBook(id);
    }

    public int addBook(String title,double price) {
        return bookMapper.addBook(title,price);
    }
}
