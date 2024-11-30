package library.database;

import library.models.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    private Connection connection;

    // Hàm khởi tạo kết nối
    public MemberDAO() {
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

    // Hàm lấy tất cả các thành viên
    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();

        // Câu truy vấn để lấy tất cả thành viên
        String sql = "SELECT memberid, name, email, phone, address, joindate , username , password , quyentruycap FROM member";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            // Duyệt qua tất cả các bản ghi trong ResultSet
            while (resultSet.next()) {
                int memberId = resultSet.getInt("memberid");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String accessRights = resultSet.getString("quyentruycap");


                // Tạo đối tượng Member và thêm vào danh sách
                Member member = new Member(memberId, name, email, phone, address ,username ,password,accessRights);
                members.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return members;
    }

    // Phương thức để xóa thành viên theo ID
    public boolean deleteMemberById(String memberId) {
        String sql = "DELETE FROM member WHERE memberid = ?";  // Sử dụng tên bảng đúng là `member`
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {  // Sử dụng connection thay vì con

            pstmt.setString(1, memberId);

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Thay đổi thông tin sinh viên
    public boolean updateMemberInfo(String memberId, String updatedName, String updatedEmail, String updatedPhone, String updatedAddress , String updateUserName , String updatePassword , String updateAccessRights ) {
        boolean isUpdated = false;

        try {
            // Câu truy vấn để cập nhật tất cả thông tin thành viên
            String query = "UPDATE member SET name = ?, email = ?, phone = ?, address = ? , username = ? , password = ? , quyentruycap = ? WHERE memberid = ?";
            PreparedStatement ps = connection.prepareStatement(query);

            // Gán giá trị vào các tham số của PreparedStatement
            ps.setString(1, updatedName);
            ps.setString(2, updatedEmail);
            ps.setString(3, updatedPhone);
            ps.setString(4, updatedAddress);
            ps.setString(5, updateUserName);
            ps.setString(6, updatePassword);
            ps.setString(7, updateAccessRights);
            ps.setString(8, memberId);


            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                isUpdated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    // Hàm kiểm tra thông tin đăng nhập của admin
    public boolean checkLoginadmin(String username, String password) {
        String sql = "SELECT * FROM member WHERE username = ? AND password = ? AND quyentruycap = '1'";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // Hàm kiểm tra thông tin đăng nhập của User
    public boolean checkLoginuser(String username, String password) {
        String sql = "SELECT * FROM member WHERE username = ? AND password = ? AND quyentruycap = '0'";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Hàm đăng kí

    public boolean registerMember(String name, String email, String username, String password, String phone, String address) {

        if (isUsernameTaken(username)) {
            return false;
        }

        String sql = "INSERT INTO member (name, email, username, password, phone, address, quyentruycap) VALUES (?, ?, ?, ?, ?, ?, '0')";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            pstmt.setString(5, phone);
            pstmt.setString(6, address);

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean isUsernameTaken(String username) {
        String sql = "SELECT COUNT(*) FROM member WHERE username = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Nếu count > 0, tên đăng nhập đã tồn tại
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Nếu không có lỗi và tên không tồn tại, trả về false
    }

//
// Phương thức tìm kiếm thành viên theo từ khóa
public List<Member> searchMembers(String searchText) {
    List<Member> members = new ArrayList<>();
    String sql = "SELECT * FROM member WHERE name LIKE ? OR email LIKE ? OR phone LIKE ? OR address LIKE ? OR username LIKE ?";

    try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
        // Thực hiện tìm kiếm với từ khóa trong các trường name, email, phone, address, username
        String searchPattern = "%" + searchText + "%"; // Tạo mẫu tìm kiếm
        pstmt.setString(1, searchPattern);
        pstmt.setString(2, searchPattern);
        pstmt.setString(3, searchPattern);
        pstmt.setString(4, searchPattern);
        pstmt.setString(5, searchPattern);

        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int memberId = rs.getInt("memberid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String accessRights = rs.getString("quyentruycap");

                Member member = new Member(memberId, name, email, phone, address, username, password, accessRights);
                members.add(member);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return members;
}







    // Hàm đóng kết nối (nên gọi khi không còn cần thiết)
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}