package com.cts.service;

import com.cts.dao.BookDao;
import com.cts.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookDao bookDaoImpl;

    public Books saveData(Books books){
        return bookDaoImpl.saveData(books);
    }

    public Optional<Books> getDataByBookId(int bookId){
        return bookDaoImpl.getDataByBookId(bookId);
    }

    public List<Books> getAllData(){
        return bookDaoImpl.getAllData();
    }

    public Books updateData(Books books){
        return bookDaoImpl.updateData(books);
    }

    public void deleteById(int bookId){
        bookDaoImpl.deleteById(bookId);
    }

    public void deleteAll() {
        bookDaoImpl.deleteAll();
    }
}
