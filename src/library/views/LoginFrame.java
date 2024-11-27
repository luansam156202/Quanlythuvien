/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.views;

import java.awt.event.ActionEvent;

/**
 *
 * @author nxq78
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginFrame() {
        initComponents();
        setResizable(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adminbutton = new javax.swing.JButton();
        userbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setAlwaysOnTop(true);
        setName("LIBRARYMANAGERMENTSYSTEM"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("PHẦM MỀM QUẢN LÝ THƯ VIỆN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(830, 50, 394, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("TRƯỜNG ĐẠI HỌC CÔNG NGHỆ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(880, 100, 286, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librarylogo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 699);

        adminbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_admin.png"))); // NOI18N
        adminbutton.setPreferredSize(new java.awt.Dimension(100, 100));
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }

            private void adminbuttonActionPerformed(ActionEvent evt) {

                AdminLoginFrame frame = new AdminLoginFrame();
                frame.setVisible(true);
                LoginFrame.this.dispose();


            }
        });
        getContentPane().add(adminbutton);
        adminbutton.setBounds(860, 370, 120, 120);


        userbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_user.png"))); // NOI18N
        userbutton.setPreferredSize(new java.awt.Dimension(100, 100));
        userbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbuttonActionPerformed(evt);
            }
            private void userbuttonActionPerformed(ActionEvent evt) {
                UserLoginFrame frame = new UserLoginFrame();
                frame.setVisible(true);
                LoginFrame.this.dispose();
            }
        });
        getContentPane().add(userbutton);
        userbutton.setBounds(1070, 370, 120, 120);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ĐĂNG NHẬP DƯỚI QUYỀN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(900, 250, 250, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Quản trị viên");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(880, 500, 80, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Người dùng");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1100, 500, 70, 16);

        pack();
    }// </editor-fold>

    private void userbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton userbutton;
    // End of variables declaration
}
