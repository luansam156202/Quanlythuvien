package library.models;

// Lớp BookRequest kế thừa từ lớp Book
public class BookRequest extends Books {
    private String requestedBy;  // Người yêu cầu sách
    private String requestDate;  // Ngày yêu cầu sách

    // Constructor: Sử dụng constructor của lớp cha (Book) và thêm thuộc tính của lớp con
    public BookRequest(int bookId, String title, String author, int year, String requestedBy, String requestDate) {
       // super(bookId, title, author, year);  // Gọi constructor của lớp cha
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
                ", year=" + getYear() +
                ", requestedBy='" + requestedBy + '\'' +
                ", requestDate='" + requestDate + '\'' +
                '}';
    }
}
