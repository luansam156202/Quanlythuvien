package library.models;

import java.sql.Timestamp;  // Import cho kiểu Timestamp

// Lớp BookRequest không nhất thiết phải kế thừa từ Books
public class BookRequest {
    private int bookId;  // Mã sách
    private String userName;
    private String title;  // Tên sách
    private String author;  // Tác giả
    private String publisher;  // Nhà xuất bản
    private String year;  // Năm xuất bản
    private String isbn;  // ISBN của sách
    private String categoryId;  // Mã thể loại sách
    private int quantity;  // Số lượng sách
    private int available;  // Số sách có sẵn

    private String requestedBy;  // Người yêu cầu sách
    private Timestamp requestDate;  // Ngày yêu cầu sách (dùng Timestamp)

    // Constructor cho BookRequest (không kế thừa từ Books)
    public BookRequest(int bookId, String username , String title, String author, Timestamp requestDate) {
        this.bookId = bookId;
        this.userName = username;
        this.title = title;
        this.author = author;
        this.requestDate = requestDate;

        // Gán các giá trị mặc định cho các thuộc tính còn lại
        this.publisher = "Unknown";
        this.year = "Unknown";
        this.isbn = "Unknown";
        this.categoryId = "Unknown";
        this.quantity = 1;
        this.available = 1;
        this.requestedBy = "Anonymous";
    }


    // Getter và Setter cho tất cả các thuộc tính

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

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    // Override phương thức toString() để bao gồm tất cả các thuộc tính của lớp
    @Override
    public String toString() {
        return "BookRequest{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year='" + year + '\'' +
                ", isbn='" + isbn + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", quantity=" + quantity +
                ", available=" + available +
                ", requestedBy='" + requestedBy + '\'' +
                ", requestDate=" + requestDate +
                '}';
    }
}
