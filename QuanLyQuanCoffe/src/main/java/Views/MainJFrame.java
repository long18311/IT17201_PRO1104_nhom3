/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Utilities.Auth;
import javax.swing.JOptionPane;

/**
 *
 * @author vanlo
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        init();
    }

    public void init() {
        setLocationRelativeTo(null);
        setTitle("Main chính");
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.isManager()) {
            lbluser.setText(Auth.getUser().getUserName());
            btnNV.setVisible(true);
            btnSP.setVisible(true);
            btnKH.setVisible(true);
            btnBH.setVisible(true);
            btnTT.setVisible(true);
            btnTK.setVisible(true);
        } else if (Auth.isLogin()) {
            lbluser.setText(Auth.getUser().getUserName());
            btnTK.setVisible(false);
            btnNV.setVisible(false);
            btnSP.setVisible(false);
            btnKH.setVisible(true);
            btnBH.setVisible(true);
            btnTT.setVisible(true);
        } else {
            btnTK.setVisible(false);
            btnNV.setVisible(false);
            btnSP.setVisible(false);
            btnKH.setVisible(false);
            btnBH.setVisible(false);
            btnTT.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDX = new javax.swing.JButton();
        btnNV = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        btnSP = new javax.swing.JButton();
        btnBH = new javax.swing.JButton();
        btnTT = new javax.swing.JButton();
        lbluser = new javax.swing.JLabel();
        btnDMK = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Main chính");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.jpg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Key.png"))); // NOI18N
        jButton1.setText("Ðăng Nhập");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        btnDX.setText("Ðăng Xuất");
        btnDX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDXActionPerformed(evt);
            }
        });

        btnNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhanvien.png"))); // NOI18N
        btnNV.setText("Nhân Viên");
        btnNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });

        btnKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/khachhang.png"))); // NOI18N
        btnKH.setText("Khách Hàng");
        btnKH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHActionPerformed(evt);
            }
        });

        btnSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit.png"))); // NOI18N
        btnSP.setText("Sản Phẩm");
        btnSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });

        btnBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mua.png"))); // NOI18N
        btnBH.setText("Bán Hàng");
        btnBH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBHActionPerformed(evt);
            }
        });

        btnTT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThanhToan.png"))); // NOI18N
        btnTT.setText("Thanh Toán");
        btnTT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTActionPerformed(evt);
            }
        });

        lbluser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User.png"))); // NOI18N

        btnDMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shield.png"))); // NOI18N
        btnDMK.setText("đổi mật khẩu");
        btnDMK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDMK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDMKActionPerformed(evt);
            }
        });

        btnTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thongke.png"))); // NOI18N
        btnTK.setText("thống kê");
        btnTK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBH))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(149, 149, 149)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDMK))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDX, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDMK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        new SanPhamJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnSPActionPerformed

    private void btnBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBHActionPerformed
        new BanHangJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnBHActionPerformed

    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
        new ThanhtoanJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnTTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.isManager()) {
            lbluser.setText(Auth.getUser().getUserName());
            btnTK.setVisible(true);
            btnNV.setVisible(true);
            btnSP.setVisible(true);
            btnKH.setVisible(true);
            btnBH.setVisible(true);
            btnTT.setVisible(true);
        } else if (Auth.isLogin()) {
            lbluser.setText(Auth.getUser().getUserName());
            btnNV.setVisible(false);
            btnSP.setVisible(false);
            btnTK.setVisible(false);
            btnKH.setVisible(true);
            btnBH.setVisible(true);
            btnTT.setVisible(true);
        } else {
            btnNV.setVisible(false);
            btnSP.setVisible(false);
            btnKH.setVisible(false);
            btnBH.setVisible(false);
            btnTT.setVisible(false);
            btnTK.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDXActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn đằng xuất ko?", "Đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            Auth.setUser(null);
            lbluser.setText("");
            btnNV.setVisible(false);
            btnSP.setVisible(false);
            btnKH.setVisible(false);
            btnBH.setVisible(false);
            btnTT.setVisible(false);
            btnTK.setVisible(false);
        }

    }//GEN-LAST:event_btnDXActionPerformed

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        new NhanVienJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDMKActionPerformed
        new NVMKJDialog(this, true,Auth.getUser().getId()).setVisible(true);
    }//GEN-LAST:event_btnDMKActionPerformed

    private void btnKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHActionPerformed
        new KhachHangJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnKHActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBH;
    private javax.swing.JButton btnDMK;
    private javax.swing.JButton btnDX;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnTT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}