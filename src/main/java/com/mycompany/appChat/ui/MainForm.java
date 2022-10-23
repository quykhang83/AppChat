/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appChat.ui;

import com.mycompany.duyapp.helper.ShareData;
import com.mycompany.duyapp.model.NguoiDung;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Duy
 */
public class MainForm extends javax.swing.JFrame {
   
    private LoginDialog loginDialog;
    private ChangePasswordFrame changePasswordFrame;
    private NguoiDung nguoidung;
    /**
     * Creates new form MainForm
     */
     public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
           
        
         
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        qlnv = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        qlcc = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblVaitro = new javax.swing.JLabel();
        btnChangePasswword = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        dhfjdf = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFile_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManageGPA = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuNoiDung = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);

        tbrLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator6);

        qlnv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qlnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        qlnv.setText("Quản lý nhân viên");
        qlnv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        qlnv.setFocusable(false);
        qlnv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        qlnv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        qlnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlnvActionPerformed(evt);
            }
        });
        jToolBar1.add(qlnv);
        jToolBar1.add(jSeparator5);

        qlcc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qlcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/gpa-icon-32.png"))); // NOI18N
        qlcc.setText("Quản lý chấm công");
        qlcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        qlcc.setFocusable(false);
        qlcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        qlcc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        qlcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlccActionPerformed(evt);
            }
        });
        jToolBar1.add(qlcc);
        jToolBar1.add(jSeparator4);

        tbrAboutUs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Actions-help-about-icon-32.png"))); // NOI18N
        tbrAboutUs.setText("Giới thiệu");
        tbrAboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);

        tplMainBoard.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bạn là: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Quyền:");

        lblUserName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(51, 51, 255));

        lblVaitro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVaitro.setForeground(new java.awt.Color(255, 51, 51));

        btnChangePasswword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChangePasswword.setForeground(new java.awt.Color(0, 153, 0));
        btnChangePasswword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnChangePasswword.setText("Đổi mật khẩu");
        btnChangePasswword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangePasswword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePasswword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswwordActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 51, 51));

        dhfjdf.setBackground(new java.awt.Color(255, 102, 51));
        dhfjdf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dhfjdf.setForeground(new java.awt.Color(255, 0, 0));
        dhfjdf.setText("Hệ Thống");
        dhfjdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dhfjdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhfjdfActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Login-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        dhfjdf.add(jMenuItem1);
        dhfjdf.add(jSeparator1);

        mnuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Button-Close-icon-16.png"))); // NOI18N
        mnuFile_Exit.setText("Thoát");
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        dhfjdf.add(mnuFile_Exit);

        jMenuBar1.add(dhfjdf);

        jMenu2.setBackground(new java.awt.Color(255, 102, 51));
        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("Quản lý");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuManageStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManageStudent.setText("Quản lý nhân viên");
        mnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageStudent);
        jMenu2.add(jSeparator2);

        mnuManageGPA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageGPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/gpa-icon.png"))); // NOI18N
        mnuManageGPA.setText("Quản lý chấm công");
        mnuManageGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageGPAActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageGPA);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 102, 51));
        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setForeground(new java.awt.Color(255, 0, 0));
        jMenu3.setText("Trợ giúp");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuNoiDung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuNoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Help-icon-16.png"))); // NOI18N
        mnuNoiDung.setText("Nội dung");
        mnuNoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNoiDungActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNoiDung);
        jMenu3.add(jSeparator3);

        mnuAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Actions-help-about-icon-16.png"))); // NOI18N
        mnuAboutUs.setText("Giới thiệu");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVaitro, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangePasswword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVaitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnChangePasswword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void dhfjdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dhfjdfActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_dhfjdfActionPerformed

    private void mnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageStudentActionPerformed
      
        
    }//GEN-LAST:event_mnuManageStudentActionPerformed

    private void mnuManageGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageGPAActionPerformed
        
    }//GEN-LAST:event_mnuManageGPAActionPerformed
    
    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
       
       
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        tbrAboutUsActionPerformed(evt);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
    int ok = JOptionPane.showConfirmDialog(this, "Bạn có thật sự muốn đăng xuất không?",
            "Đăng xuất",JOptionPane.YES_NO_OPTION);
    if (ok == JOptionPane.YES_OPTION) {
        if (loginDialog == null) loginDialog = new LoginDialog();
        this.dispose();
        loginDialog.setVisible(true);
    }
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void qlnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlnvActionPerformed
        mnuManageStudentActionPerformed(evt);
    }//GEN-LAST:event_qlnvActionPerformed

    private void qlccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlccActionPerformed
        mnuManageGPAActionPerformed(evt); // TODO add your handling code here:
    }//GEN-LAST:event_qlccActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tbrLogoutActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuNoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNoiDungActionPerformed
        String s = new String ();
        s = "Phần mềm được thiết kế để có thể dễ dàng làm các công việc sau: \n"
                + "- Quản lý thông tin của nhân viên.\n"
                + "- Quản lý chấm công cho nhân viên theo từng ngày cụ thể.\n"
                + "- Tính lương chi trả cho nhân viên khi đến tháng trả lương.";
        JOptionPane.showMessageDialog(this,s,"Nội dung",JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_mnuNoiDungActionPerformed

    private void btnChangePasswwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswwordActionPerformed
        //if (changePasswordFrame == null) changePasswordFrame = new ChangePasswordFrame(this, nguoidung);
        changePasswordFrame.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnChangePasswwordActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePasswword;
    private javax.swing.JMenu dhfjdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVaitro;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JMenuItem mnuManageGPA;
    private javax.swing.JMenuItem mnuManageStudent;
    private javax.swing.JMenuItem mnuNoiDung;
    private javax.swing.JButton qlcc;
    private javax.swing.JButton qlnv;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
