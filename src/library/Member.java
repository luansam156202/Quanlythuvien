package library;

public class Member {
    private String name;
    private int memberId;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}
