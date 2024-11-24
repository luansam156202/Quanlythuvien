package library.models;

public class Books {
    private int bookId;          // Tương ứng với cột 'bookid' (INT)
    private String title;        // Tương ứng với cột 'title' (VARCHAR)
    private String author;       // Tương ứng với cột 'author' (VARCHAR)
    private String publisher;    // Tương ứng với cột 'publisher' (VARCHAR)
    private String year;         // Tương ứng với cột 'year' (VARCHAR)
    private String isbn;         // Tương ứng với cột 'isbn' (VARCHAR)
    private String categoryId;   // Tương ứng với cột 'categoryid' (VARCHAR)
    private int quantity;        // Tương ứng với cột 'quantity' (INT)

    // Constructor không tham số
    public Books() {
    }

    // Constructor có tham số
    public Books(int bookId, String title, String author, String publisher, String year, String isbn, String categoryId, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
        this.categoryId = categoryId;
        this.quantity = quantity;
    }

    // Getters và Setters
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Phương thức toString() để hiển thị thông tin Books
    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year='" + year + '\'' +
                ", isbn='" + isbn + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
