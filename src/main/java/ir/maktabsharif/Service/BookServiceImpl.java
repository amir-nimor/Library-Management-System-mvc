package ir.maktabsharif.Service;

import ir.maktabsharif.Model.Book;
import ir.maktabsharif.Repository.BookRepository;
import ir.maktabsharif.Repository.BookRepositoryImpl;
import ir.maktabsharif.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void create(Book book) {
        if (!book.getTitle().isBlank() && !book.getAuthor().isBlank()){
            bookRepository.create(book);
        }
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() ->  new BookNotFoundException("book not founded"));
    }
}
