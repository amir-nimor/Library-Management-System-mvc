package ir.maktabsharif.Service;

import ir.maktabsharif.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    void create(Book book);

    List<Book> findAll();

    Book findById(Long id);

}
