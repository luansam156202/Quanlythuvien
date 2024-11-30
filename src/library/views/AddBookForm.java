package library.views;

import library.database.BookDAO;
import library.models.Books;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookForm extends JFrame {
    private JTextField titleField, authorField, publisherField, yearField, isbnField, categoryIdField, quantityField, availableField;
    private JButton btnAddBook, btnCancel;

    public AddBookForm() {
        setTitle("Add New Book");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Đóng cửa sổ khi nhấn nút "X"
        setLocationRelativeTo(null);  // Đặt cửa sổ ở giữa màn hình

        // Tạo các JLabel và JTextField cho các trường nhập liệu
        JLabel lblTitle = new JLabel("Tên sách :");
        JLabel lblAuthor = new JLabel("Tác giả :  ");
        JLabel lblPublisher = new JLabel("Nhà xuất bản :");
        JLabel lblYear = new JLabel("Năm :");
        JLabel lblIsbn = new JLabel("ISBN:");
        JLabel lblCategoryId = new JLabel("Mã thể loại:");
        JLabel lblQuantity = new JLabel("Số lượng:");
        JLabel lblAvailable = new JLabel("Sẵn có :");

        titleField = new JTextField();
        authorField = new JTextField();
        publisherField = new JTextField();
        yearField = new JTextField();
        isbnField = new JTextField();
        categoryIdField = new JTextField();
        quantityField = new JTextField();
        availableField = new JTextField();

        btnAddBook = new JButton("Add Book");
        btnCancel = new JButton("Cancel");

        // Thiết lập Layout cho form
        setLayout(new GridLayout(9, 2, 10, 10));

        // Thêm các thành phần vào form
        add(lblTitle); add(titleField);
        add(lblAuthor); add(authorField);
        add(lblPublisher); add(publisherField);
        add(lblYear); add(yearField);
        add(lblIsbn); add(isbnField);
        add(lblCategoryId); add(categoryIdField);
        add(lblQuantity); add(quantityField);
        add(lblAvailable); add(availableField);
        add(btnAddBook); add(btnCancel);

        // Xử lý sự kiện nút "Add Book"
        btnAddBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBookActionPerformed(e);
            }
        });

        // Xử lý sự kiện nút "Cancel"
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Đóng cửa sổ khi nhấn "Cancel"
            }
        });
    }

    private void addBookActionPerformed(ActionEvent evt) {
        // Lấy giá trị từ các trường nhập liệu
        String title = titleField.getText().trim();  // Trường tên sách
        String author = authorField.getText().trim();  // Trường tác giả
        String publisher = publisherField.getText().trim();  // Trường nhà xuất bản
        String year = yearField.getText().trim();  // Trường năm xuất bản
        String isbn = isbnField.getText().trim();  // Trường mã ISBN
        String categoryId = categoryIdField.getText().trim();  // Trường mã thể loại
        String quantityStr = quantityField.getText().trim();  // Trường số lượng
        String availableStr = availableField.getText().trim();  // Trường số lượng có sẵn

        // Kiểm tra nếu có trường nào bị bỏ trống
        if (title.isEmpty() || author.isEmpty() || publisher.isEmpty() || year.isEmpty() ||
                isbn.isEmpty() || categoryId.isEmpty() || quantityStr.isEmpty() || availableStr.isEmpty()) {

            // Nếu có trường trống, hiển thị thông báo lỗi
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin vào tất cả các trường!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;  // Dừng thực hiện nếu có trường trống
        }

        // Chuyển đổi giá trị số lượng và số lượng có sẵn sang kiểu int
        int quantity = 0;
        int available = 0;
        try {
            quantity = Integer.parseInt(quantityStr);
            available = Integer.parseInt(availableStr);
        } catch (NumberFormatException e) {
            // Nếu không thể chuyển đổi, hiển thị thông báo lỗi
            JOptionPane.showMessageDialog(this, "Số lượng và số lượng có sẵn phải là số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo đối tượng Books từ các thông tin đã nhập
        Books newBook = new Books(0, title, author, publisher, year, isbn, categoryId, quantity, available);

        // Thêm sách vào cơ sở dữ liệu thông qua DAO
        BookDAO bookDAO = new BookDAO();
        boolean isAdded = bookDAO.addBook(newBook);

        // Kiểm tra kết quả thêm sách
        if (isAdded) {
            // Nếu thêm thành công, thông báo cho người dùng và cập nhật danh sách sách
            JOptionPane.showMessageDialog(this, "Sách đã được thêm thành công!");
            dispose();  // Đóng cửa sổ sau khi thêm thành công
        } else {
            // Nếu thêm thất bại, thông báo lỗi
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi thêm sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Kiểm tra form thêm sách
        new AddBookForm().setVisible(true);
    }
}
