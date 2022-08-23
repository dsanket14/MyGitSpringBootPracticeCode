package com.cts.controller;

import com.cts.exception.RecordNotFound;
import com.cts.model.Books;
import com.cts.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookServiceImpl;

    @PostMapping("/save")
    public Books saveData(@RequestBody Books books){
        return bookServiceImpl.saveData(books);
    }

    @GetMapping("/getbyid/{bookId}")
    public ResponseEntity<Optional<Books>> getDataByBookId(@PathVariable int bookId){
       Optional<Books> books=bookServiceImpl.getDataByBookId(bookId);

        if(books==null){
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(books));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Books>> getAllData(){
        List<Books> booksList= bookServiceImpl.getAllData();
        if(booksList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(booksList));
    }

    @PutMapping("/updatedata/{bookId}")
    public Books updateData(@RequestBody Books books, @PathVariable int bookId) throws RecordNotFound {
        Books books1=bookServiceImpl.getDataByBookId(bookId).orElseThrow(()->new RecordNotFound(bookId+" not found"));
        books1.setBookAuthour(books.getBookAuthour());
        books1.setBookName(books.getBookName());
        books1.setBookLength(books.getBookLength());
        books1.setBookLaunchDate(books.getBookLaunchDate());
        books1.setBookPrice(books.getBookPrice());

        return bookServiceImpl.updateData(books1);
    }

    @DeleteMapping("/deletebyid/{bookId}")
    public String deleteById(@PathVariable int bookId){
        bookServiceImpl.deleteById(bookId);
        return "data deleted successfully for ="+bookId;
    }

    @DeleteMapping("/deleteall")
    public String deleteAll(){
        bookServiceImpl.deleteAll();
        return "All data deleted Successfully";
    }
}

