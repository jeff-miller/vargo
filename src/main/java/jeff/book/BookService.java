package jeff.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public List<Book> getBooksForAuthor(int authorId) {
        return jdbcTemplate.query(
                "select b.bookId, b.title from bookAuthor ba inner join book b on ba.bookId = b.bookId where ba.authorId=?", 
                new Object[]{authorId}, 
                new BookRowMapper());
    }
}
