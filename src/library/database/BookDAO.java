package library.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import library.models.BookRequest;
import library.models.Books;
import library.models.BorrowRecord;

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
        // Cập nhật câu lệnh SQL để tìm kiếm theo tên sách, tác giả, ISBN và thể loại
        String query = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR isbn LIKE ? OR categoryid LIKE ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            // Thêm dấu "%" vào từ khóa tìm kiếm để tìm kiếm gần đúng (LIKE trong SQL)
            String searchPattern = "%" + searchQuery + "%";  // Tìm kiếm với mẫu

            // Cài đặt các tham số vào câu lệnh SQL
            stmt.setString(1, searchPattern);  // Tìm kiếm theo tên sách
            stmt.setString(2, searchPattern);  // Tìm kiếm theo tác giả
            stmt.setString(3, searchPattern);  // Tìm kiếm theo ISBN
            stmt.setString(4, searchPattern);  // Tìm kiếm theo thể loại

            try (ResultSet rs = stmt.executeQuery()) {
                // Duyệt qua các kết quả trả về từ cơ sở dữ liệu
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



    public boolean addBook(Books book) {
        // Câu lệnh SQL để thêm sách
        String query = "INSERT INTO books (title, author, publisher, year, isbn, categoryid, quantity, available) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Sử dụng kết nối đã khởi tạo trong lớp BookDAO
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            // Gán các giá trị vào câu lệnh SQL
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getPublisher());
            stmt.setString(4, book.getYear());
            stmt.setString(5, book.getIsbn());
            stmt.setString(6, book.getCategoryId());
            stmt.setInt(7, book.getQuantity());
            stmt.setInt(8, book.getAvailable());

            // Thực thi câu lệnh INSERT
            int rowsAffected = stmt.executeUpdate();

            // Kiểm tra xem có bản ghi nào được thêm vào không
            return rowsAffected > 0;  // Nếu có bản ghi được thêm, trả về true
        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Nếu có lỗi, trả về false
        }
    }

    public boolean createBookRequest(String username, String title, String author) {
        String query = "INSERT INTO bookrequest (username, title, author, requestdate) VALUES (?, ?, ?, NOW())";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);  // Truyền username
            stmt.setString(2, title);     // Truyền title
            stmt.setString(3, author);    // Truyền author

            int rowsInserted = stmt.executeUpdate();  // Thực thi câu lệnh SQL
            return rowsInserted > 0;  // Nếu có bản ghi được thêm vào, trả về true
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;  // Trả về false nếu có lỗi
    }
    public List<BorrowRecord> getBooksBorrowedByUser(String username) {
        List<BorrowRecord> borrowedBooks = new ArrayList<>();
        String query = "SELECT * FROM BorrowRecords WHERE username = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int recordid = rs.getInt("recordid");
                String title = rs.getString("title");
                Timestamp borrowDate = rs.getTimestamp("borrowdate");

                borrowedBooks.add(new BorrowRecord(recordid, title, borrowDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return borrowedBooks;
    }

    public boolean returnBook(int recordid) {
        String query = "DELETE FROM BorrowRecords WHERE recordid = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, recordid);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;  // Nếu có ít nhất một bản ghi bị xóa, trả về true
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Lấy tất cả yêu cầu mượn sách từ bảng bookrequest
    public List<BookRequest> getAllBookRequests() throws SQLException {
        List<BookRequest> requests = new ArrayList<>();
        String query = "SELECT * FROM bookrequest";

        try (PreparedStatement pst = connection.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                int requestid = rs.getInt("requestid");
                String username = rs.getString("username");
                String title = rs.getString("title");
                String author = rs.getString("author");
                Timestamp requestdate = rs.getTimestamp("requestdate");

                requests.add(new BookRequest(requestid, username, title, author,  requestdate ));
            }
        }

        return requests;
    }

    // Phương thức chấp nhận yêu cầu mượn sách
    public boolean acceptBookRequest(int requestid) throws SQLException {
        String selectQuery = "SELECT * FROM bookrequest WHERE requestid = ?";
        String insertQuery = "INSERT INTO borrowrecords (username, title, borrowdate) VALUES (?, ?, ?)";
        String deleteQuery = "DELETE FROM bookrequest WHERE requestid = ?";

        try (PreparedStatement selectStmt = connection.prepareStatement(selectQuery)) {
            selectStmt.setInt(1, requestid);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                // Lấy thông tin yêu cầu
                String username = rs.getString("username");
                String title = rs.getString("title");
                Timestamp requestDate = rs.getTimestamp("requestdate");

                // Thêm vào bảng borrowrecords
                try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                    insertStmt.setString(1, username);
                    insertStmt.setString(2, title);
                    insertStmt.setTimestamp(3, requestDate);
                    int rowsInserted = insertStmt.executeUpdate();

                    if (rowsInserted > 0) {
                        // Sau khi thêm vào borrowrecords, xóa yêu cầu khỏi bảng bookrequest
                        try (PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery)) {
                            deleteStmt.setInt(1, requestid);
                            int rowsDeleted = deleteStmt.executeUpdate();
                            return rowsDeleted > 0; // Trả về true nếu xóa thành công
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;  // Trả về false nếu có lỗi xảy ra
    }

    // Phương thức từ chối yêu cầu mượn sách
    public boolean rejectBookRequest(int requestid) throws SQLException {
        String deleteQuery = "DELETE FROM bookrequest WHERE requestid = ?";

        try (PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery)) {
            deleteStmt.setInt(1, requestid);
            int rowsDeleted = deleteStmt.executeUpdate();
            return rowsDeleted > 0; // Trả về true nếu xóa thành công
        }
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
