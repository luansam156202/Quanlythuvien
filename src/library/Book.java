package library;

// Lớp Book kế thừa từ lớp Document
public class Book extends Document {
    // Thuộc tính bổ sung
    private String isbn;  // Mã ISBN
    private int pages;    // Số trang
    private String language; // Ngôn ngữ

    // Constructor (Phương thức khởi tạo)
    public Book(String id, String title, String author, int year, String genre, int copies, String isbn, int pages, String language) {
        super(id, title, author, year, genre, copies); // Gọi Constructor của lớp cha
        this.isbn = isbn;
        this.pages = pages;
        this.language = language;
    }

    // Getter và Setter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Ghi đè (Override) phương thức hiển thị thông tin
    @Override
    public void displayInfo() {
        // Gọi phương thức displayInfo của lớp cha
        super.displayInfo();
        // Thêm thông tin đặc trưng của Book
        System.out.println("ISBN: " + isbn);
        System.out.println("Pages: " + pages);
        System.out.println("Language: " + language);
    }

    public void borrowBook() {
    }
}
