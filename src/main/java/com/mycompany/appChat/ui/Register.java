/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appChat.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Truong
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegister = new javax.swing.JPanel();
        txtusername = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        lblComfirmPassword = new javax.swing.JLabel();
        txtComfirmPassword = new javax.swing.JPasswordField();
        btnSignup1 = new javax.swing.JButton();
        lblLogi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER NEW ACCOUNT");

        pnlRegister.setBackground(new java.awt.Color(255, 255, 102));

        txtusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 255));
        lblUserName.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 255));
        lblPassword.setText("Password");

        txtpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setText("REGISTER NEW ACCOUNT");

        lblComfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblComfirmPassword.setForeground(new java.awt.Color(0, 0, 255));
        lblComfirmPassword.setText("Comfirm password");

        txtComfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSignup1.setBackground(new java.awt.Color(0, 255, 51));
        btnSignup1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignup1.setForeground(new java.awt.Color(0, 0, 255));
        btnSignup1.setText("SIGN UP");
        btnSignup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignup1ActionPerformed(evt);
            }
        });

        lblLogi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblLogi.setForeground(new java.awt.Color(0, 0, 255));
        lblLogi.setText("You have an account?");
        lblLogi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtusername)
                                .addComponent(txtpw)
                                .addComponent(txtComfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(lblComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterLayout.createSequentialGroup()
                                    .addComponent(lblLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSignup1)))
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblTitle)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnSignup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignup1ActionPerformed
        // TODO add your handling code here:
        String taikhoan,matkhau, matkhau2;
        taikhoan = txtusername.getText().trim();
        matkhau = txtpw.getText().trim();
        matkhau2 = txtComfirmPassword.getText().trim();
        
        if (taikhoan.isEmpty()){
            JOptionPane.showMessageDialog(this,"Tài khoản không được để trống","CẢNH BÁO",JOptionPane.ERROR_MESSAGE);
            txtusername.requestFocus();
        }else
        if (matkhau.isEmpty()){
            JOptionPane.showMessageDialog(this,"Mật khẩu không được để trống","CẢNH BÁO",JOptionPane.ERROR_MESSAGE);
            txtpw.requestFocus();
        }else
        if (matkhau2.isEmpty()){
            JOptionPane.showMessageDialog(this,"Nhac lai MK không được để trống","CẢNH BÁO",JOptionPane.ERROR_MESSAGE);
            txtComfirmPassword.requestFocus();
        } else
        if (matkhau2.compareTo(matkhau)!=0){
            JOptionPane.showMessageDialog(this,"Mat khau khong khop","CẢNH BÁO",JOptionPane.ERROR_MESSAGE);
            txtComfirmPassword.requestFocus();
        } else
        
        // 
        try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String Url = "jdbc:sqlserver://localhost:1433;databaseName=App_Chat;user=sa;password=sa";
                    Connection conn = DriverManager.getConnection(Url);
                  
                    String sql="INSERT INTO ACCOUNT VALUES(?,?,?)";
                    PreparedStatement st = conn.prepareStatement(sql);
                  
                    st.setString(1, taikhoan);
                    st.setString(2, matkhau);
                    st.setInt(3, 1);
                    st.executeUpdate();
                   
                    JOptionPane.showMessageDialog(this,"Dang ki thanh cong, hay vao dang nhap!");
                    st.close();
                    conn.close();
                     this.dispose();
                        Login log = new Login();
                        log.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,"Username đã tồn tại, chon username khac","CẢNH BÁO",JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_btnSignup1ActionPerformed

    private void lblLogiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogiMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_lblLogiMouseClicked

    private void lblLogiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogiMouseEntered
        // TODO add your handling code here:
        lblLogi.setForeground(new java.awt.Color(255, 0, 51));
    }//GEN-LAST:event_lblLogiMouseEntered

    private void lblLogiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogiMouseExited
        // TODO add your handling code here:
        lblLogi.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_lblLogiMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup1;
    private javax.swing.JLabel lblComfirmPassword;
    private javax.swing.JLabel lblLogi;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPasswordField txtComfirmPassword;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
