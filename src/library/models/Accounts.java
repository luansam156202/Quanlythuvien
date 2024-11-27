package library.models;

public class Accounts {
    private int accountid;   // ID của tài khoản (sẽ là khóa chính hoặc Auto Increment)
    private String username; // Tên đăng nhập
    private String password; // Mật khẩu
    private int memberid;    // ID của người dùng hoặc thành viên liên kết với tài khoản

    // Constructor không tham số (dùng để tạo đối tượng mà không cần truyền tham số)
    public Accounts() {
    }

    // Constructor có tham số (dùng để khởi tạo đối tượng với các giá trị cụ thể)
    public Accounts(int accountid, String username, String password, int memberid) {
        this.accountid = accountid;
        this.username = username;
        this.password = password;
        this.memberid = memberid;
    }

    // Getter và Setter cho accountid
    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
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

    // Getter và Setter cho memberid
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    // Phương thức toString() để dễ dàng hiển thị thông tin tài khoản
    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", memberid=" + memberid +
                '}';
    }
}
