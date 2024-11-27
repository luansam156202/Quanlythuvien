package library.models;

import java.time.LocalDateTime;

public class Member {
    private int memberId;          // Tương ứng với cột 'memberid' (INT)
    private String name;           // Tương ứng với cột 'name' (VARCHAR)
    private String email;          // Tương ứng với cột 'email' (VARCHAR)
    private String phone;          // Tương ứng với cột 'phone' (VARCHAR)
    private String address;        // Tương ứng với cột 'address' (VARCHAR)
    private String joinDate;       // Tương ứng với cột 'joindate' (DATETIME)
    private String username;       // Tương ứng với cột 'username' (VARCHAR)
    private String password;       // Tương ứng với cột 'password' (VARCHAR)
    private String accessRights;   // Tương ứng với cột 'access_rights' (quyentruycap)

    // Constructor không tham số
    public Member() {
    }

    // Constructor có tham số
    public Member(int memberId, String name, String email, String phone, String address, String joinDate, String username, String password, String accessRights) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.joinDate = joinDate;
        this.username = username;
        this.password = password;
        this.accessRights = accessRights;
    }

    // Getters và Setters
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(String accessRights) {
        this.accessRights = accessRights;
    }

    // Phương thức toString() để hiển thị thông tin Member
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", joinDate=" + joinDate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accessRights='" + accessRights + '\'' +
                '}';
    }
}
