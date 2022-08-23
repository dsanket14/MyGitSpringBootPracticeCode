package com.cts.dao;


import com.cts.model.Books;
import com.cts.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookDao {

    @Autowired
    private BookRepo bookRepoImpl;

    public Books saveData(Books books){
        return bookRepoImpl.save(books);
    }

    public Optional<Books> getDataByBookId(int bookId){
        return bookRepoImpl.findById(bookId);
    }

    public List<Books> getAllData(){
        return bookRepoImpl.findAll();
    }

    public Books updateData(Books books){
        return bookRepoImpl.save(books);
    }

    public void deleteById(int bookId){
        bookRepoImpl.deleteById(bookId);
    }

    public void deleteAll(){
        bookRepoImpl.deleteAll();
    }
}
