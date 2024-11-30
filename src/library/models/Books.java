package library.models;

public class Books {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String year;
    private String isbn;
    private String categoryId;
    private int quantity;
    private int available;

    // Constructor
    public Books(int bookId, String title, String author, String publisher, String year, String isbn, String categoryId, int quantity, int available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
        this.categoryId = categoryId;
        this.quantity = quantity;
        this.available = available;
    }

    // Getter và Setter
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getCategoryId() { return categoryId; }
    public void setCategoryId(String categoryId) { this.categoryId = categoryId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getAvailable() { return available; }
    public void setAvailable(int available) { this.available = available; }

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
                ", available=" + available +
                '}';
    }
}
