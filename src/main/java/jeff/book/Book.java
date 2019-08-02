package jeff.book;

public class Book {
    int bookId;
    String title;
    
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + "]";
    }
}
