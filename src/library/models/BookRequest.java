package library.models;

// Lớp BookRequest kế thừa từ lớp Books
public class BookRequest extends Books {
    private String requestedBy;  // Người yêu cầu sách
    private String requestDate;  // Ngày yêu cầu sách

    // Constructor: Sử dụng constructor của lớp cha (Books) và thêm thuộc tính của lớp con
    public BookRequest(int bookId, String title, String author, String publisher, String year, String isbn, String categoryId, int quantity, int available, String requestedBy, String requestDate) {
        // Gọi constructor của lớp cha (Books)
        super(bookId, title, author, publisher, year, isbn, categoryId, quantity, available);

        // Khởi tạo các thuộc tính của lớp con
        this.requestedBy = requestedBy;
        this.requestDate = requestDate;
    }

    // Getter và Setter cho requestedBy
    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    // Getter và Setter cho requestDate
    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    // Override phương thức toString() để bao gồm các thuộc tính của lớp con
    @Override
    public String toString() {
        return "BookRequest{" +
                "bookId=" + getBookId() +  // Gọi getter của lớp cha
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", year='" + getYear() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", categoryId='" + getCategoryId() + '\'' +
                ", quantity=" + getQuantity() +
                ", available=" + getAvailable() +
                ", requestedBy='" + requestedBy + '\'' +
                ", requestDate='" + requestDate + '\'' +
                '}';
    }
}
