package library.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import library.models.Books;

public class BookDAO {
    // Connection details (change these to your DB configuration)
    private Connection connection;

    // Hàm khởi tạo kết nối
    public BookDAO() {
        try {
            // Kết nối tới cơ sở dữ liệu
            String url = "jdbc:mysql://localhost:3306/librarydb";
            String username = "root";
            String password = "Quang7864@@";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get all books from the database
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        String query = "SELECT * FROM books";

        // JDBC connection
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Xử lý kết quả trả về
            while (rs.next()) {
                int bookId = rs.getInt("bookid");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                String isbn = rs.getString("isbn");
                String categoryId = rs.getString("categoryid");
                int quantity = rs.getInt("quantity");
                int available = rs.getInt("available");

                // Tạo đối tượng Books và thêm vào danh sách
                Books book = new Books(bookId, title, author, publisher, year, isbn, categoryId, quantity, available);
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    // Phương thức xóa sách
    public boolean deleteBook(int bookId) {
        String query = "DELETE FROM books WHERE bookid = ?";  // Câu lệnh SQL để xóa sách

        // Sử dụng đối tượng connection đã khởi tạo trong lớp BookDAO
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            // Gán bookId vào câu lệnh SQL
            stmt.setInt(1, bookId);

            // Thực thi câu lệnh xóa
            int rowsAffected = stmt.executeUpdate();

            // Kiểm tra xem có xóa được dòng nào không
            return rowsAffected > 0;  // Nếu có sách bị xóa thì trả về true
        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Nếu có lỗi, trả về false
        }
    }

    public List<Books> searchBooks(String searchQuery) {
        List<Books> books = new ArrayList<>();
        String query = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR isbn LIKE ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            // Thêm dấu "%" vào từ khóa tìm kiếm để tìm kiếm gần đúng (LIKE trong SQL)
            String searchPattern = "%" + searchQuery + "%";
            stmt.setString(1, searchPattern);  // tìm kiếm theo tiêu đề sách
            stmt.setString(2, searchPattern);  // tìm kiếm theo tác giả
            stmt.setString(3, searchPattern);  // tìm kiếm theo ISBN

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int bookId = rs.getInt("bookid");
                    String title = rs.getString("title");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    String year = rs.getString("year");
                    String isbn = rs.getString("isbn");
                    String categoryId = rs.getString("categoryid");
                    int quantity = rs.getInt("quantity");
                    int available = rs.getInt("available");

                    // Tạo đối tượng Books và thêm vào danh sách
                    Books book = new Books(bookId, title, author, publisher, year, isbn, categoryId, quantity, available);
                    books.add(book);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }





    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        BookDAO dao = new BookDAO();
        List<Books> books = dao.getAllBooks();

        // In tất cả các sách
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
