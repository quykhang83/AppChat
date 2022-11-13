/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appChat.ui;

import com.mycompany.appChat.dao.ChannelDAO;
import com.mycompany.appChat.dao.MessageDAO;
import com.mycompany.appChat.helper.ImageHelper;
import com.mycompany.appChat.model.Message;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author quykhang
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    String username;
    int idChannel = -1;
    private byte[] imageOS;

    public DashBoard() {

        initComponents();
        setLocationRelativeTo(null);

        this.setVisible(true);

    }

    public DashBoard(String user) {
        username = user;

        initComponents();
        displayListAcc();
        setLocationRelativeTo(null);
        lblname.setText("Hello " + user);
        initTable();
        renderToTableChat(tblModel);
        tblChat.setBackground(Color.WHITE);
        displayMyChat();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMyChat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbChat = new javax.swing.JComboBox<>();
        txtContent = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        lblChatWith = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChat = new javax.swing.JTable();
        btnSendImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Hello Truong");

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Change password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("My chat");

        tblMyChat.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        tblMyChat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblMyChat.setRowHeight(30);
        tblMyChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMyChatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMyChat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Choose an account to chat");

        cmbChat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbChat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChatItemStateChanged(evt);
            }
        });
        cmbChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChatActionPerformed(evt);
            }
        });

        txtContent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContentActionPerformed(evt);
            }
        });
        txtContent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContentKeyPressed(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblChatWith.setBackground(new java.awt.Color(255, 255, 255));
        lblChatWith.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblChatWith.setForeground(new java.awt.Color(0, 0, 153));
        lblChatWith.setText("Chatting with Khang");

        tblChat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblChat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblChat.setEnabled(false);
        tblChat.setGridColor(new java.awt.Color(255, 255, 255));
        tblChat.setRowHeight(26);
        tblChat.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblChat.setShowHorizontalLines(false);
        tblChat.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblChat);

        btnSendImg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSendImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/duyapp/icons/Save-icon-48.png"))); // NOI18N
        btnSendImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblChatWith, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbChat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtContent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendImg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbChat)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChatWith, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendImg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword(username);
        cp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbChatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChatItemStateChanged
        // TODO add your handling code here:
        lblChatWith.setText("Chatting with " + cmbChat.getSelectedItem());
        initTable();
        renderToTableChat(tblModel);
        tblChat.setBackground(Color.WHITE);

        //displayContentChat(username, cmbChat.getSelectedItem());
    }//GEN-LAST:event_cmbChatItemStateChanged

    private void cmbChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbChatActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:

        tblModel.addRow(new Object[]{
            "", txtContent.getText()
        });
        int rowCount = tblChat.getRowCount() - 1;
        tblChat.changeSelection(rowCount, 1, rootPaneCheckingEnabled, rootPaneCheckingEnabled);

        // them vao CSDL
        try {
            MessageDAO md = new MessageDAO();

            int idN = md.getIDNewMessage();
            String realtime = java.time.LocalDateTime.now().toString().substring(0, 19);

            Message mess = new Message(idN, idChannel, 1, txtContent.getText(),
                    realtime, cmbChat.getSelectedItem().toString());

            md.insertTextMessage(mess);
            md.updateLastChannelTime(mess);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chon nguoi de chat", "CẢNH BÁO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        txtContent.setText("");
        txtContent.requestFocus();
        displayMyChat();

    }//GEN-LAST:event_btnSendActionPerformed

    private void txtContentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContentKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {

            tblModel.addRow(new Object[]{
                "", txtContent.getText()
            });

            int rowCount = tblChat.getRowCount() - 1;
            tblChat.changeSelection(rowCount, 1, rootPaneCheckingEnabled, rootPaneCheckingEnabled);

            // them vao CSDL
            try {
                MessageDAO md = new MessageDAO();

                int idN = md.getIDNewMessage();
                String realtime = java.time.LocalDateTime.now().toString().substring(0, 19);

                Message mess = new Message(idN, idChannel, 1, txtContent.getText(),
                        realtime, cmbChat.getSelectedItem().toString());

                md.insertTextMessage(mess);
                md.updateLastChannelTime(mess);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "chon nguoi de chat", "CẢNH BÁO", JOptionPane.ERROR_MESSAGE);
            }
            txtContent.setText("");
            displayMyChat();
            txtContent.requestFocus();
        }
    }//GEN-LAST:event_txtContentKeyPressed

    private void tblMyChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMyChatMouseClicked
        // TODO add your handling code here:
        int row = tblMyChat.getSelectedRow();
        System.out.println("row " + row);

        cmbChat.setSelectedItem(tblModel_mychat.getValueAt(row, 0).toString());
        System.out.println(tblModel_mychat.getValueAt(row, 0));
        lblChatWith.setText("Chatting with " + cmbChat.getSelectedItem());
        initTable();
        renderToTableChat(tblModel);
        tblChat.setBackground(Color.WHITE);
    }//GEN-LAST:event_tblMyChatMouseClicked

    private void btnSendImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".png");
                }
            }

            @Override
            public String getDescription() {
                return "Image File (*.png)";
            }
        });
        if (chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            MessageDAO md = new MessageDAO();

            int idN = md.getIDNewMessage();
            String realtime = java.time.LocalDateTime.now().toString().substring(0, 19);

            Message mess = new Message(idN, idChannel, 2, file.getPath(),
                    realtime, cmbChat.getSelectedItem().toString());

            md.insertTextMessage(mess);
            md.updateLastChannelTime(mess);

//            ImageIcon icon = new ImageIcon((String) mess.getContent());
//            Image img = ImageHelper.resize(icon.getImage(), 180, 200);
//            ImageIcon resizedIcon = new ImageIcon(img);
//            lblAvt.setIcon(resizedIcon);
//            imageOS = ImageHelper.toByteArray(img, "png");
            txtContent.setText("");
            displayMyChat();
            txtContent.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSendImgActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendImg;
    private javax.swing.JComboBox<String> cmbChat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChatWith;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblChat;
    private javax.swing.JTable tblMyChat;
    private javax.swing.JTextField txtContent;
    // End of variables declaration//GEN-END:variables

    private void displayListAcc() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://localhost:1433;databaseName=App_Chat;user=demo;password=demo";
            Connection conn = DriverManager.getConnection(Url);
            String sql = "select USERNAME from ACCOUNT";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                if (!rs.getString(1).equals(username)) {
                    cmbChat.addItem(rs.getString(1));
                }
            }

            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void renderToTableChat(DefaultTableModel tblModel) {
        tblModel.setRowCount(0);
        try {
            ChannelDAO cd = new ChannelDAO();
            idChannel = cd.getIDChannel(username, cmbChat.getSelectedItem().toString());

            if (cd.displayTextMessage(idChannel, tblModel, username, tblChat)==2) {
//                tblChat.getColumnModel().getColumn(0).setCellRenderer(new ImageRender());
//                tblChat.getColumnModel().getColumn(1).setCellRenderer(new ImageRender());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tblModel.fireTableDataChanged();
        int rowCount = tblChat.getRowCount() - 1;
        tblChat.changeSelection(rowCount, 1, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
    }

    private DefaultTableModel tblModel, tblModel_mychat;

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new Object[]{"", ""});
        tblChat.setModel(tblModel);
    }

    private void initTable_mychat() {
        tblModel_mychat = new DefaultTableModel();
        tblModel_mychat.setColumnIdentifiers(new Object[]{"", ""});
        tblMyChat.setModel(tblModel_mychat);
    }

    public void renderToTableMyChat(DefaultTableModel tblModel) {
        tblModel.setRowCount(0);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://localhost:1433;databaseName=App_Chat;user=demo;password=demo";
            Connection conn = DriverManager.getConnection(Url);

            // hien thi 
            String sql = "select * from channel  JOIN (select distinct idchannel from message) as bang on (channel.id=idchannel) and ((sender=?) or (title=?))  order by lastTime DESC";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, username);
            ResultSet rs = st.executeQuery();

            Object[] row;
            while (rs.next()) {
                if (rs.getString(5).equals(username)) {
                    System.out.println(username);
                    tblModel.addRow(new Object[]{
                        rs.getString(2), rs.getString(3)
                    });
                } else {
                    tblModel.addRow(new Object[]{
                        rs.getString(5), rs.getString(3)
                    });
                }

            }

            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tblModel.fireTableDataChanged();
    }

    private void displayMyChat() {
        initTable_mychat();
        renderToTableMyChat(tblModel_mychat);

    }

    private class ImageRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            String photoName = value.toString();
            ImageIcon imgIcon = new ImageIcon(new ImageIcon(photoName)
                    .getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            return new JLabel(imgIcon);
        }
    }

}
