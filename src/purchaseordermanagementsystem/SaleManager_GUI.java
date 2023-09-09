/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author YAO FENG PC
 */
public class SaleManager_GUI extends javax.swing.JFrame {
    private SaleManager saleManager;
    /**
     * Creates new form SaleManager_GUI
     */
    public SaleManager_GUI(SaleManager saleManager) {
        this.saleManager = saleManager;
        setTitle("Sale Manager Menu");
        initComponents();
        getContentPane().setBackground(new java.awt.Color(159, 163, 227));
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

        supplierButton = new javax.swing.JButton();
        itemListButton = new javax.swing.JButton();
        saleButton = new javax.swing.JButton();
        viewPOButton = new javax.swing.JButton();
        PRButton = new javax.swing.JButton();
        userAccountButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        supplierButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        supplierButton.setText("Supplier List");
        supplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierButtonActionPerformed(evt);
            }
        });

        itemListButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        itemListButton.setText("Item List");
        itemListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListButtonActionPerformed(evt);
            }
        });

        saleButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        saleButton.setText(" Sale List");
        saleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleButtonActionPerformed(evt);
            }
        });

        viewPOButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        viewPOButton.setText("View Purchase Order");
        viewPOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPOButtonActionPerformed(evt);
            }
        });

        PRButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        PRButton.setText("Purchase Requisition");
        PRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRButtonActionPerformed(evt);
            }
        });

        userAccountButton.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        userAccountButton.setText("User Account");
        userAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAccountButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setText("Sale Manager - Menu");

        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogOutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LogOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(itemListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleButtonActionPerformed
        ManageSale_GUI manageSaleGUI = new ManageSale_GUI(saleManager);
        manageSaleGUI.show();
        dispose();
    }//GEN-LAST:event_saleButtonActionPerformed

    private void userAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAccountButtonActionPerformed
        EditUser_GUI editUserGUI = new EditUser_GUI(saleManager);
        editUserGUI.show();
        dispose();
    }//GEN-LAST:event_userAccountButtonActionPerformed

    private void supplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierButtonActionPerformed
        ManageSupplier_GUI manageSupplierGUI = new ManageSupplier_GUI(saleManager);
        manageSupplierGUI.show();
        dispose();
    }//GEN-LAST:event_supplierButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        Login_GUI loginGUI = new Login_GUI();
        loginGUI.show();
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void itemListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListButtonActionPerformed
        ManageItem_GUI manageItemGUI = new ManageItem_GUI(saleManager);
        manageItemGUI.show();
        dispose();
    }//GEN-LAST:event_itemListButtonActionPerformed

    private void viewPOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPOButtonActionPerformed
        ViewPO_GUI viewPOGUI = new ViewPO_GUI(saleManager);
        viewPOGUI.show();
        dispose();
    }//GEN-LAST:event_viewPOButtonActionPerformed

    private void PRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRButtonActionPerformed
        ManagePR_GUI managePRGUI = new ManagePR_GUI(saleManager);
        managePRGUI.show();
        dispose();
    }//GEN-LAST:event_PRButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SaleManager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleManager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleManager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleManager_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SaleManager_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton PRButton;
    private javax.swing.JButton itemListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saleButton;
    private javax.swing.JButton supplierButton;
    private javax.swing.JButton userAccountButton;
    private javax.swing.JButton viewPOButton;
    // End of variables declaration//GEN-END:variables
}
