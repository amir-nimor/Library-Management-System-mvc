package ir.maktabsharif.controller;

import ir.maktabsharif.Model.Book;
import ir.maktabsharif.Service.BookService;
import ir.maktabsharif.exception.BookNotFoundException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/all")
    public String getAllBook(Model model){
        model.addAttribute("books",bookService.findAll());
        return "showAllBook";
    }

    @GetMapping("/{id}")
    public String getSpecificBook(Model model, @PathVariable("id") Long id , HttpServletResponse response) throws IOException {
        try {
            Book book = bookService.findById(id);
            model.addAttribute("book", book);
            return "book";
        }catch (BookNotFoundException e){
            response.sendError(404);
        }
        return "";
    }


    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String addForm(){
        return "addForm";
    }


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)

    public ResponseEntity<String> addForm(
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            @RequestParam("publisheryear") Integer year
    ){
        Book book = Book.builder().title(title).author(author).publicationYear(year).build();

        bookService.create(book);

        return (ResponseEntity<String>) ResponseEntity.ok(book).status(HttpStatus.CREATED).header("message","book Created");
    }



}
