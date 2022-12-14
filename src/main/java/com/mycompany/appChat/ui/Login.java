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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Login() {
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
        txtusername1 = new javax.swing.JTextField();
        lblcre = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        btnSignup1 = new javax.swing.JButton();
        lblUserName1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER NEW ACCOUNT");

        pnlRegister.setBackground(new java.awt.Color(255, 255, 102));

        txtusername1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtusername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusername1ActionPerformed(evt);
            }
        });

        lblcre.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblcre.setForeground(new java.awt.Color(0, 0, 255));
        lblcre.setText("Create an account?");
        lblcre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcreMouseExited(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 255));
        lblPassword.setText("Password");

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setText("APP CHAT CT240");

        btnSignup1.setBackground(new java.awt.Color(0, 255, 51));
        btnSignup1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignup1.setForeground(new java.awt.Color(0, 0, 255));
        btnSignup1.setText("SIGN IN");
        btnSignup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignup1ActionPerformed(evt);
            }
        });

        lblUserName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(0, 0, 255));
        lblUserName1.setText("Username");

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(lblTitle))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegisterLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblcre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSignup1))
                            .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtusername1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(txtPass)))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txtusername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSignup1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusername1ActionPerformed

    private void btnSignup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignup1ActionPerformed
        // TODO add your handling code here:
        
        String tk=txtusername1.getText().trim();
        String pw=txtPass.getText();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://localhost:1433;databaseName=App_Chat;user=demo;password=demo";
            Connection conn = DriverManager.getConnection(Url);
            String sql = "select * from ACCOUNT where Username='"+tk+"'" ;
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
        
            if (rs.next()) { 
               if(rs.getString(2).equals(pw))
               { 
                    DashBoard db = new DashBoard(tk);
                    db.setVisible(true);
                    this.dispose();
               }else {
                   JOptionPane.showMessageDialog(this, "Sai m???t kh???u!","C???NH B??O",JOptionPane.ERROR_MESSAGE);
               }
            }else
                JOptionPane.showMessageDialog(this, "Username khong ton tai!","C???NH B??O",JOptionPane.ERROR_MESSAGE);
                  
            rs.close();
            st.close();
            conn.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnSignup1ActionPerformed

    private void lblcreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcreMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Register reg = new Register();
        reg.setVisible(true);
    }//GEN-LAST:event_lblcreMouseClicked

    private void lblcreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcreMouseEntered
        // TODO add your handling code here:
        lblcre.setForeground(new java.awt.Color(255, 0, 51));
    }//GEN-LAST:event_lblcreMouseEntered

    private void lblcreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcreMouseExited
        // TODO add your handling code here:
        lblcre.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_lblcreMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblcre;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtusername1;
    // End of variables declaration//GEN-END:variables
}
