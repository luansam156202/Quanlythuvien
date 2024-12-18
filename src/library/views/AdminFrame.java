/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.views ;

import library.database.MemberDAO;
import library.models.Member;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 *
 * @author nxq78
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
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

        mnguser = new javax.swing.JButton();
        mngbook = new javax.swing.JButton();
        mngrecord = new javax.swing.JButton();
        delete_member = new javax.swing.JButton();
        addmember = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        submitsearch = new javax.swing.JButton();
        list_user = new javax.swing.JButton();
        edit_info = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setAlwaysOnTop(true);
        setName("LIBRARYMANAGERMENTSYSTEM"); // NOI18N

        mnguser.setBackground(new java.awt.Color(153, 204, 255));
        mnguser.setText("Quản lí người dùng ");
        mnguser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnguserActionPerformed(evt);
            }
        });

        mngbook.setBackground(new java.awt.Color(153, 204, 255));
        mngbook.setText("Quản lý sách");
        mngbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngbookActionPerformed(evt);
            }
        });

        mngrecord.setBackground(new java.awt.Color(153, 204, 255));
        mngrecord.setText("Quản lý mượn / trả sách ");
        mngrecord.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngrecordActionPerformed(evt);
            }

            private void mngrecordActionPerformed(ActionEvent evt) {
            }

        });

        delete_member.setText("Xóa người dùng ");
        delete_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_memberActionPerformed(evt);
            }
        });

        addmember.setText("Thêm người dùng ");
        addmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmemberActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null}


                },
                new String [] {
                        "ID", "Họ và tên", "email", "Số điện thoại ", "Địa chỉ " , "Tài khoản" , "Mật khẩu" , "Quyền truy cập"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        search.setText("Nhập id , họ tên , email , số điện thoại , .....");

        submitsearch.setBackground(new java.awt.Color(102, 255, 102));
        submitsearch.setText("Tìm kiếm ");
        submitsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitsearchActionPerformed(evt);
            }
        });

        list_user.setText("Danh sách người dùng ");
        list_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_userActionPerformed(evt);
            }
        });

        edit_info.setText("Sửa thông tin người dùng ");
        edit_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_infoActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setText("Trở lại ");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(addmember, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(list_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(delete_member, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(edit_info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(mnguser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mngbook, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mngrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(98, 98, 98)
                                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(submitsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mnguser)
                                        .addComponent(mngbook)
                                        .addComponent(mngrecord)
                                        .addComponent(back))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(submitsearch))
                                .addGap(18, 18, 18)
                                .addComponent(addmember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(list_user)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_member)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_info)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void addmemberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        AddMemberFrame addMemberFrame = new AddMemberFrame() ;
        addMemberFrame.setVisible(true);
        this.dispose();
    }

    private void submitsearchActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy dữ liệu nhập vào từ ô tìm kiếm
        String searchText = search.getText().trim();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Tìm kiếm và hiển thị kết quả
        MemberDAO memberDAO = new MemberDAO();
        List<Member> members = memberDAO.searchMembers(searchText); // Tạo phương thức tìm kiếm trong MemberDAO

        if (members.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Cập nhật JTable với kết quả tìm kiếm
            updateMemberTable(members);
        }
    }


    private void mnguserActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mngbookActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        BookFrame bookFrame = new BookFrame();
        bookFrame.setVisible(true);
        AdminFrame.this.dispose();
    }

    private void edit_infoActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy chỉ số dòng được chọn trong JTable
        int selectedRow = jTable1.getSelectedRow();

        // Kiểm tra nếu không có dòng nào được chọn
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thành viên để sửa thông tin.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }


        String memberId = jTable1.getValueAt(selectedRow, 0).toString();

        String currentName = jTable1.getValueAt(selectedRow, 1).toString();
        String currentEmail = jTable1.getValueAt(selectedRow, 2).toString();
        String currentPhone = jTable1.getValueAt(selectedRow, 3).toString();
        String currentAddress = jTable1.getValueAt(selectedRow, 4).toString();
        String currentUsername = jTable1.getValueAt(selectedRow,5).toString();
        String currentPassword = jTable1.getValueAt(selectedRow,6).toString();
        String currentAccessRights = jTable1.getValueAt(selectedRow,7).toString();

        String updatedName = JOptionPane.showInputDialog(this, "Nhập tên mới:", "Cập nhật tên", JOptionPane.PLAIN_MESSAGE, null, null, currentName).toString();
        String updatedEmail = JOptionPane.showInputDialog(this, "Nhập email mới:", "Cập nhật email", JOptionPane.PLAIN_MESSAGE, null, null, currentEmail).toString();
        String updatedPhone = JOptionPane.showInputDialog(this, "Nhập số điện thoại mới:", "Cập nhật số điện thoại", JOptionPane.PLAIN_MESSAGE, null, null, currentPhone).toString();
        String updatedAddress = JOptionPane.showInputDialog(this, "Nhập địa chỉ mới:", "Cập nhật địa chỉ", JOptionPane.PLAIN_MESSAGE, null, null, currentAddress).toString();
        String updatedUsername = JOptionPane.showInputDialog(this, "Nhập tên đăng nhâp mới:", "Cập nhật tên đăng nhập", JOptionPane.PLAIN_MESSAGE, null, null, currentUsername).toString();
        String updatedPassword = JOptionPane.showInputDialog(this, "Nhập mật khẩu mới:", "Cập nhật mật khẩu", JOptionPane.PLAIN_MESSAGE, null, null, currentPassword).toString();
        String updatedAccessRights = JOptionPane.showInputDialog(this, "Nhập quyền truy cập mới:", "Cập nhật quyền truy cập", JOptionPane.PLAIN_MESSAGE, null, null, currentAccessRights).toString();

        if (updatedName != null && updatedEmail != null && updatedPhone != null && updatedAddress != null &&
                !updatedName.trim().isEmpty() && !updatedEmail.trim().isEmpty() && !updatedPhone.trim().isEmpty() && !updatedAddress.trim().isEmpty()) {


            MemberDAO memberDAO = new MemberDAO();
            boolean result = memberDAO.updateMemberInfo(memberId, updatedName, updatedEmail, updatedPhone, updatedAddress , updatedUsername, updatedPassword, updatedAccessRights);
            if (result) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                loadMemberData();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loadMemberData() {

        MemberDAO memberDAO = new MemberDAO();
        List<Member> members = memberDAO.getAllMembers();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Xóa dữ liệu cũ trong JTable
        for (Member member : members) {
            Object[] row = {member.getMemberId(), member.getName(), member.getEmail(), member.getPhone(), member.getAddress() , member.getUsername(), member.getPassword(), member.getAccessRights()};
            model.addRow(row);
        }
    }




    private void delete_memberActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {

            String memberId = jTable1.getValueAt(selectedRow, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa thành viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                MemberDAO memberDAO = new MemberDAO();
                boolean isDeleted = memberDAO.deleteMemberById(memberId);

                if (isDeleted) {

                    JOptionPane.showMessageDialog(null, "Xóa thành viên thành công.");
                    list_userActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thành viên không thành công.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thành viên cần xóa.");
        }
    }


    private void list_userActionPerformed(java.awt.event.ActionEvent evt) {

        MemberDAO memberDAO = new MemberDAO();
        List<Member> members = memberDAO.getAllMembers();

        // Tạo DefaultTableModel với các tên cột
        String[] columnNames = {"ID", "Họ và tên", "Email", "Số điện thoại", "Địa chỉ" , "Tài khoản " , "Mật khẩu " , "Quyền truy cập"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);


        for (Member member : members) {
            Object[] row = {
                    member.getMemberId(),
                    member.getName(),
                    member.getEmail(),
                    member.getPhone(),
                    member.getAddress(),
                    member.getUsername(),
                    member.getPassword(),
                    member.getAccessRights()

            };
            model.addRow(row);
        }

        // Cập nhật model cho JTable
        jTable1.setModel(model);   // Cập nhật model cho JTable
        jScrollPane1.setViewportView(jTable1);  // Đảm bảo JScrollPane hiển thị lại JTable
    }

    private void updateMemberTable(List<Member> members) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Member member : members) {
            Object[] row = {member.getMemberId(), member.getName(), member.getEmail(), member.getPhone(), member.getAddress(), member.getUsername(), member.getPassword(), member.getAccessRights()};
            model.addRow(row);
        }

        // Đảm bảo JScrollPane hiển thị lại JTable
        jScrollPane1.setViewportView(jTable1);
    }




    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        AdminLoginFrame adminLoginFrame = new AdminLoginFrame();
        adminLoginFrame.setVisible(true);
        AdminFrame.this.dispose();

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addmember;
    private javax.swing.JButton back;
    private javax.swing.JButton delete_member;
    private javax.swing.JButton edit_info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton list_user;
    private javax.swing.JButton mngbook;
    private javax.swing.JButton mngrecord;
    private javax.swing.JButton mnguser;
    private javax.swing.JTextField search;
    private javax.swing.JButton submitsearch;
    // End of variables declaration
}