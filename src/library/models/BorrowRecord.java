package library.models;

import java.util.Date;

public class BorrowRecord {
    private int recordid;
    private String title;
    private Date borrowDate;

    public BorrowRecord(int recordid, String title, Date borrowDate) {
        this.recordid = recordid;
        this.title = title;
        this.borrowDate = borrowDate;
    }

    public int getRecordid() {
        return recordid;
    }

    public String getTitle() {
        return title;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }
}
