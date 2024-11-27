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
            String url = "jdbc:mysql://localhost:3306/librarydb"; // Thay bằng tên database của bạn
            String username = "root"; // Thay bằng username của bạn
            String password = "Quang7864@@"; // Thay bằng password của bạn

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
                String joinDateStr = resultSet.getString("joindate");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String accessRights = resultSet.getString("quyentruycap");

                // Chuyển đổi joinDate từ String (VARCHAR) sang LocalDateTime

                // Tạo đối tượng Member và thêm vào danh sách
                Member member = new Member(memberId, name, email, phone, address, joinDateStr  ,username ,password,accessRights);
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

    public boolean updateMemberInfo(String memberId, String updatedName, String updatedEmail, String updatedPhone, String updatedAddress , String updateUserName , String updatePassword , String updateAccessRights ) {
        boolean isUpdated = false;

        try {
            // Câu truy vấn để cập nhật tất cả thông tin thành viên
            String query = "UPDATE member SET name = ?, email = ?, phone = ?, address = ? , username = ? , password = ? , quyentruycap WHERE memberid = ?";
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

            // Thực thi câu lệnh update
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                isUpdated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
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
