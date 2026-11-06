package ir.maktabsharif.Repository;

import ir.maktabsharif.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    void create(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

}
