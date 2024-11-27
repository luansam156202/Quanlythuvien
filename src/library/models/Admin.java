package library.models;

public class Admin {
    private int adminid;   // ID của quản trị viên (sẽ là khóa chính hoặc Auto Increment)
    private String username; // Tên đăng nhập của quản trị viên
    private String password; // Mật khẩu của quản trị viên

    // Constructor không tham số (dùng để tạo đối tượng mà không cần truyền tham số)
    public Admin() {
    }

    // Constructor có tham số (dùng để khởi tạo đối tượng với các giá trị cụ thể)
    public Admin(int adminid, String username, String password) {
        this.adminid = adminid;
        this.username = username;
        this.password = password;
    }

    // Getter và Setter cho adminid
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    // Getter và Setter cho username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter và Setter cho password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Phương thức toString() để dễ dàng hiển thị thông tin quản trị viên
    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
