package library;

public class Document {
    // Thuộc tính
    private String id;        // Mã định danh tài liệu
    private String title;     // Tiêu đề tài liệu
    private String author;    // Tên tác giả
    private int year;         // Năm xuất bản
    private String genre;     // Thể loại
    private int copies;       // Số lượng bản sao
    private String status;    // Trạng thái ("available", "borrowed")

    // Constructor (Phương thức khởi tạo)
    public Document(String id, String title, String author, int year, String genre, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.copies = copies;
        this.status = (copies > 0) ? "available" : "borrowed";
    }

    // Getter và Setter (Phương thức truy cập và thay đổi thuộc tính)
    public String getId() {
        return id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCopies() {
        return copies;
    }

    public String getStatus() {
        return status;
    }

    // Phương thức hiển thị thông tin tài liệu
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Copies: " + copies);
        System.out.println("Status: " + status);
    }

    // Kiểm tra tài liệu có sẵn để mượn không
    public boolean isAvailable() {
        return "available".equals(status) && copies > 0;
    }

    // Phương thức cho mượn tài liệu
    public void borrow() {
        if (isAvailable()) {
            copies--;
            if (copies == 0) {
                status = "borrowed";
            }
            System.out.println("Document borrowed successfully.");
        } else {
            System.out.println("Document is not available.");
        }
    }

    // Phương thức trả tài liệu
    public void returnDocument() {
        copies++;
        status = "available";
        System.out.println("Document returned successfully.");
    }
}
