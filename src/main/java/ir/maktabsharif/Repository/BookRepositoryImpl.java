package ir.maktabsharif.Repository;

import ir.maktabsharif.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository{


    private static final List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book(1L,"amnir","ali",2020));
        bookList.add(new Book(2L,"amngkir","alsdfghi",4523));
        bookList.add(new Book(3L,"amnfgnir","alxfghi",752));
    }

    @Override
    public void create(Book book) {
        if (book.getId() == null){
            book.setId(bookList.size()+1L);
        }
        bookList.add(book);
    }

    @Override
    public List<Book> findAll() {
        return bookList;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookList.stream().filter(b -> b.getId() == id).findFirst();
    }
}
