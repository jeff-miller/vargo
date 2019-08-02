package jeff;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import jeff.book.Book;
import jeff.book.BookService;

@Controller 
public class MainController {
    BookService bookService;
    
    
    public MainController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }
    
    @GetMapping("/books/{authorId}")
    @ResponseBody
    public List<Book> booksForAuthor(@PathVariable int authorId, Model model) {
        return bookService.getBooksForAuthor(authorId);
    }
}
