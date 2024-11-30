/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.views;

import library.database.BookDAO;
import library.database.MemberDAO;
import library.models.Books;
import library.models.BorrowRecord;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author nxq78
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        list_book = new javax.swing.JButton();
        sachdamuon = new javax.swing.JButton();
        trasach = new javax.swing.JButton();
        muonsach = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        doimatkhau = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        search_Field = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Managerment System");
        setAlwaysOnTop(true);

        list_book.setText("Danh sách sách");
        list_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_bookActionPerformed(evt);
            }
        });

        sachdamuon.setText("Sách đã mượn");
        sachdamuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sachdamuonActionPerformed(evt);
            }
        });

        trasach.setText("Trả sách ");
        trasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasachActionPerformed(evt);
            }
        });

        muonsach.setText("Mượn sách");
        muonsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muonsachActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Tên sách ", "Tác giả", "Nhà xuất bản ", "Năm xuất bản", "Thể loại", "Số lượng", "Sách có sẵn"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        doimatkhau.setText("Đổi mật khẩu");
        doimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doimatkhauActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(153, 153, 255));
        logout.setText("Đăng xuất");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        search_Field.setText("Nhập tên sách , tác giả , ...");

        search.setBackground(new java.awt.Color(102, 255, 102));
        search.setText("Tìm kiếm");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(doimatkhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(list_book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(muonsach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sachdamuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(trasach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(67, 67, 67)
                                                .addComponent(search_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(search)))
                                .addContainerGap(79, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(list_book)
                                        .addComponent(search_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(muonsach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sachdamuon)
                                .addGap(12, 12, 12)
                                .addComponent(trasach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doimatkhau)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(logout))
        );

        pack();
    }// </editor-fold>

    private void list_bookActionPerformed(java.awt.event.ActionEvent evt) {
        // Tạo đối tượng BookDAO để kết nối và lấy danh sách sách
        BookDAO dao = new BookDAO();

        // Lấy danh sách tất cả sách từ database
        List<Books> books = dao.getAllBooks();

        // Cập nhật bảng với danh sách sách vừa lấy
        updateTable(books);
    }


    private void muonsachActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy thông tin cuốn sách được chọn từ bảng
        int selectedRow = jTable1.getSelectedRow();  // Lấy dòng được chọn từ bảng
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một cuốn sách để mượn.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy thông tin sách từ bảng (title, author)
        String title = jTable1.getValueAt(selectedRow, 0).toString();  // Cột 0: Tên sách
        String author = jTable1.getValueAt(selectedRow, 1).toString();  // Cột 1: Tác giả

        // Lấy username của người dùng hiện tại
        String username = UserLoginFrame.loggedInUsername;  // Lấy tên đăng nhập người dùng (username)

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn cần đăng nhập để mượn sách.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Gửi yêu cầu mượn sách vào bảng bookrequest
        BookDAO dao = new BookDAO();
        boolean isSuccess = dao.createBookRequest(username, title, author);

        if (isSuccess) {
            JOptionPane.showMessageDialog(this, "Yêu cầu mượn sách đã được gửi thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi gửi yêu cầu mượn sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void sachdamuonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = UserLoginFrame.loggedInUsername;  // Lấy username người dùng đã đăng nhập

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập trước khi xem sách đã mượn.");
            return;
        }

        // Tạo đối tượng DAO để truy vấn dữ liệu từ bảng BorrowRecords
        BookDAO dao = new BookDAO();

        // Truy vấn tất cả sách đã mượn của người dùng
        List<BorrowRecord> borrowedBooks = dao.getBooksBorrowedByUser(username);

        // Hiển thị dữ liệu trong JTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Xóa tất cả dữ liệu trong bảng

        // Thêm các dòng mới vào bảng
        for (BorrowRecord record : borrowedBooks) {
            model.addRow(new Object[] {
                    record.getRecordid(),
                    record.getTitle(),
                    record.getBorrowDate()
            });
        }
    }


    private void trasachActionPerformed(java.awt.event.ActionEvent evt) {
        // Kiểm tra xem có sách nào được chọn hay không
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách cần trả.");
            return;
        }

        // Lấy thông tin về sách đã chọn
        int recordid = (Integer) jTable1.getValueAt(selectedRow, 0);  // Lấy recordid của sách đã chọn

        // Gọi DAO để xóa bản ghi trong bảng BorrowRecords
        BookDAO dao = new BookDAO();
        boolean success = dao.returnBook(recordid);

        if (success) {
            JOptionPane.showMessageDialog(this, "Trả sách thành công.");
            // Cập nhật lại danh sách sách đã mượn
            sachdamuonActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi trả sách. Vui lòng thử lại.");
        }
    }




    private void doimatkhauActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy mật khẩu cũ từ người dùng
        String oldPassword = JOptionPane.showInputDialog(this, "Nhập mật khẩu cũ:", "Đổi mật khẩu", JOptionPane.INFORMATION_MESSAGE);
        if (oldPassword == null || oldPassword.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu cũ", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy mật khẩu mới từ người dùng
        String newPassword = JOptionPane.showInputDialog(this, "Nhập mật khẩu mới:", "Đổi mật khẩu", JOptionPane.INFORMATION_MESSAGE);
        if (newPassword == null || newPassword.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu mới", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy xác nhận mật khẩu mới từ người dùng
        String confirmPassword = JOptionPane.showInputDialog(this, "Xác nhận mật khẩu mới:", "Đổi mật khẩu", JOptionPane.INFORMATION_MESSAGE);
        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận mật khẩu mới", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Kiểm tra xem mật khẩu mới và xác nhận mật khẩu có khớp không
        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới và xác nhận mật khẩu không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy tên người dùng hiện tại từ Session hoặc UserLoginFrame
        String username = UserLoginFrame.loggedInUsername; // Hoặc Session.getLoggedInUsername() nếu sử dụng lớp Session

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn cần đăng nhập trước khi đổi mật khẩu.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Gọi phương thức để kiểm tra mật khẩu cũ và cập nhật mật khẩu mới
        MemberDAO memberDAO = new MemberDAO();  // Khởi tạo đối tượng MemberDAO để kết nối với DB

        // Kiểm tra mật khẩu cũ và cập nhật mật khẩu mới
        boolean isSuccess = memberDAO.updatePasswordInDatabase(username, oldPassword, newPassword);

        if (isSuccess) {
            JOptionPane.showMessageDialog(this, "Mật khẩu đã được thay đổi thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không chính xác", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }




    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy từ khóa tìm kiếm từ ô search_Field
        String searchQuery = search_Field.getText().trim();  // Lấy giá trị và loại bỏ khoảng trắng thừa

        // Kiểm tra xem từ khóa tìm kiếm có trống không
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;  // Nếu trống, không làm gì cả
        }

        // Tạo đối tượng BookDAO để kết nối và tìm kiếm sách
        BookDAO dao = new BookDAO();

        // Tìm kiếm các sách theo từ khóa (bao gồm tên sách, tác giả, ISBN, thể loại)
        List<Books> books = dao.searchBooks(searchQuery);

        // Cập nhật bảng với kết quả tìm kiếm
        updateTable(books);
    }


    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }


    private void updateTable(List<Books> books) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();


        model.setRowCount(0);


        for (Books book : books) {
            Object[] row = new Object[7];
            row[0] = book.getTitle();
            row[1] = book.getAuthor();
            row[2] = book.getPublisher();
            row[3] = book.getYear();
            row[4] = book.getCategoryId();
            row[5] = book.getQuantity();
            row[6] = book.getAvailable();

            model.addRow(row);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton doimatkhau;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton list_book;
    private javax.swing.JButton logout;
    private javax.swing.JButton muonsach;
    private javax.swing.JButton sachdamuon;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_Field;
    private javax.swing.JButton trasach;
    // End of variables declaration
}
