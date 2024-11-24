package library.models;

import java.time.LocalDateTime;

public class Member {
    private int memberId;          // Tương ứng với cột 'memberid' (INT)
    private String name;           // Tương ứng với cột 'name' (VARCHAR)
    private String email;          // Tương ứng với cột 'email' (VARCHAR)
    private String phone;          // Tương ứng với cột 'phone' (VARCHAR)
    private String address;        // Tương ứng với cột 'address' (VARCHAR)
    private LocalDateTime joinDate; // Tương ứng với cột 'joindate' (DATETIME)

    // Constructor không tham số
    public Member() {
    }

    // Constructor có tham số
    public Member(int memberId, String name, String email, String phone, String address, LocalDateTime joinDate) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.joinDate = joinDate;
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

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
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
                '}';
    }
}

