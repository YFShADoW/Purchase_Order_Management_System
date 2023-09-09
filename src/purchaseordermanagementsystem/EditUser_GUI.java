
package purchaseordermanagementsystem;

import javax.swing.JOptionPane;

public class EditUser_GUI extends javax.swing.JFrame {
    private String[] oldTableData;
    private Administrator admin;
    private SaleManager saleManager;
    private PurchaseManager purchaseManager;
    /**
     * Creates new form EditUser
     */
    public EditUser_GUI(Administrator admin,String[] tableData) {
        setTitle("Administrator - Edit User");
        initComponents();
        oldTableData=tableData;
        this.admin =admin;
        setLocationRelativeTo(null);
        
        //set Text to textPane4
        UserIDTextPane.setText(tableData[0]);
        nameTextPane.setText(tableData[1]);
        passwordTextPane.setText(tableData[2]);
        emailTextPane.setText(tableData[3]);
        phoneTextPane.setText(tableData[4]);
        deptTextPane.setText(tableData[5]);
        staffIDTextPane.setText(tableData[6]);
        backButton.setVisible(false);
        
    }
    
    public EditUser_GUI(Administrator admin){
        setTitle("Administrator - View User Information");
        this.admin =admin;
        initComponents();
        setLocationRelativeTo(null);
        
        UserIDTextPane.setText(admin.getUserID());
        nameTextPane.setText(admin.getUserName());
        passwordTextPane.setText(admin.getUserPassword());
        emailTextPane.setText(admin.getUserEmail());
        phoneTextPane.setText(admin.getUserPhone());
        deptTextPane.setText(admin.getUserType());
        staffIDTextPane.setText(admin.getAdmin_ID());
        
        newNameLabel.setVisible(false);
        newPasswordLabel.setVisible(false);
        newEmailLabel.setVisible(false);
        newPhoneLabel.setVisible(false);
        newNameText.setVisible(false);
        newPasswordText.setVisible(false);
        newEmailText.setVisible(false);
        newPhoneText.setVisible(false);
        cancelButton.setVisible(false);
        saveButton.setVisible(false);
        editUserLabel.setText("User Information");
        
    }
    
    public EditUser_GUI(SaleManager saleManager){
        this.saleManager = saleManager;
        setTitle("Sale Manager - View User Information");
        initComponents();
        setLocationRelativeTo(null);
        
        UserIDTextPane.setText(saleManager.getUserID());
        nameTextPane.setText(saleManager.getUserName());
        passwordTextPane.setText(saleManager.getUserPassword());
        emailTextPane.setText(saleManager.getUserEmail());
        phoneTextPane.setText(saleManager.getUserPhone());
        deptTextPane.setText(saleManager.getUserType());
        staffIDTextPane.setText(saleManager.getSM_ID());
        
        newNameLabel.setVisible(false);
        newPasswordLabel.setVisible(false);
        newEmailLabel.setVisible(false);
        newPhoneLabel.setVisible(false);
        newNameText.setVisible(false);
        newPasswordText.setVisible(false);
        newEmailText.setVisible(false);
        newPhoneText.setVisible(false);
        cancelButton.setVisible(false);
        saveButton.setVisible(false);
        editUserLabel.setText("User Information");

    }
    
    public EditUser_GUI(PurchaseManager purchaseManager){
        this.purchaseManager = purchaseManager;
        setTitle("Purchase Manager - View User Information");
        initComponents();
        setLocationRelativeTo(null);
        
        UserIDTextPane.setText(purchaseManager.getUserID());
        nameTextPane.setText(purchaseManager.getUserName());
        passwordTextPane.setText(purchaseManager.getUserPassword());
        emailTextPane.setText(purchaseManager.getUserEmail());
        phoneTextPane.setText(purchaseManager.getUserPhone());
        deptTextPane.setText(purchaseManager.getUserType());
        staffIDTextPane.setText(purchaseManager.getPM_ID());
        
        newNameLabel.setVisible(false);
        newPasswordLabel.setVisible(false);
        newEmailLabel.setVisible(false);
        newPhoneLabel.setVisible(false);
        newNameText.setVisible(false);
        newPasswordText.setVisible(false);
        newEmailText.setVisible(false);
        newPhoneText.setVisible(false);
        cancelButton.setVisible(false);
        saveButton.setVisible(false);
        editUserLabel.setText("User Information");

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editUserLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        phoneTextPane = new javax.swing.JTextPane();
        newNameText = new javax.swing.JTextField();
        newPasswordText = new javax.swing.JTextField();
        newPhoneText = new javax.swing.JTextField();
        newEmailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newNameLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        passwordTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        nameTextPane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        UserIDTextPane = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        deptTextPane = new javax.swing.JTextPane();
        newPhoneLabel = new javax.swing.JLabel();
        newEmailLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        staffIDTextPane = new javax.swing.JTextPane();
        cancelButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel1.setText("UserID:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel4.setText("Email:");

        editUserLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        editUserLabel.setText("Edit User Information");

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        phoneTextPane.setEditable(false);
        jScrollPane1.setViewportView(phoneTextPane);

        newNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        newPasswordText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        newPhoneText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        newEmailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel7.setText("Department:");

        newNameLabel.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        newNameLabel.setText("New Name:");

        newPasswordLabel.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        newPasswordLabel.setText("New Password:");

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        emailTextPane.setEditable(false);
        jScrollPane2.setViewportView(emailTextPane);

        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        passwordTextPane.setEditable(false);
        jScrollPane3.setViewportView(passwordTextPane);

        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        nameTextPane.setEditable(false);
        jScrollPane4.setViewportView(nameTextPane);

        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        UserIDTextPane.setEditable(false);
        jScrollPane5.setViewportView(UserIDTextPane);

        jScrollPane6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        deptTextPane.setEditable(false);
        jScrollPane6.setViewportView(deptTextPane);

        newPhoneLabel.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        newPhoneLabel.setText("New Phone:");

        newEmailLabel.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        newEmailLabel.setText("New Email:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        jLabel12.setText("StaffID:");

        staffIDTextPane.setEditable(false);
        staffIDTextPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane7.setViewportView(staffIDTextPane);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newNameLabel)
                                    .addComponent(newPasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(80, 80, 80)
                                .addComponent(saveButton)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newEmailLabel)
                                .addGap(18, 18, 18)
                                .addComponent(newEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newPhoneLabel)
                                .addGap(18, 18, 18)
                                .addComponent(newPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backButton)
                .addGap(84, 84, 84)
                .addComponent(editUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editUserLabel)
                    .addComponent(backButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        ManageUser_GUI manageUserGUI = new ManageUser_GUI(admin);
        manageUserGUI.show();
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(!newPhoneText.getText().isBlank() && !InputValidation.isValidPhoneNumber(newPhoneText.getText())){
            JOptionPane.showMessageDialog(null,"Invalid Phone Number");
        }
        else if(!newEmailText.getText().isBlank() && !InputValidation.isValidEmail(newEmailText.getText())){
            JOptionPane.showMessageDialog(null,"Invalid Email");
        }
        else{
            String userID = UserIDTextPane.getText();
            String department = deptTextPane.getText();
            String staffID = staffIDTextPane.getText();

            String newName = newNameText.getText();
            String newPassword = newPasswordText.getText();
            String newEmail = newEmailText.getText();
            String newPhone = newPhoneText.getText();

            if(newName.isBlank()){
                newName = oldTableData[1];
            }
            if(newPassword.isBlank()){
                newPassword =oldTableData[2];
            }
            if(newEmail.isBlank()){
                newEmail = oldTableData[3];
            }
            if(newPhone.isBlank()){
                newPhone =oldTableData[4];
            }
            String[] newData  = {userID,newName,newPassword,newEmail,newPhone,department,staffID};
            admin.manageUser("edit", oldTableData, newData);

            ManageUser_GUI manageUserGUI = new ManageUser_GUI(admin);
            manageUserGUI.show();
            dispose();    
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (admin != null && saleManager == null && purchaseManager == null){
            Admin_GUI adminGUI = new Admin_GUI(admin);
            adminGUI.show();
            dispose();
        }
        else if (admin == null && saleManager != null && purchaseManager == null){
            SaleManager_GUI saleManagerGUI = new SaleManager_GUI(saleManager);
            saleManagerGUI.show();
            dispose();
        }
        else if (admin == null && saleManager == null && purchaseManager != null){
            PurchaseManager_GUI purchaseManagerGUI = new PurchaseManager_GUI(purchaseManager);
            purchaseManagerGUI.show();
            dispose();
        }
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditUser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditUser_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane UserIDTextPane;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextPane deptTextPane;
    private javax.swing.JLabel editUserLabel;
    private javax.swing.JTextPane emailTextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane nameTextPane;
    private javax.swing.JLabel newEmailLabel;
    private javax.swing.JTextField newEmailText;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameText;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordText;
    private javax.swing.JLabel newPhoneLabel;
    private javax.swing.JTextField newPhoneText;
    private javax.swing.JTextPane passwordTextPane;
    private javax.swing.JTextPane phoneTextPane;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextPane staffIDTextPane;
    // End of variables declaration//GEN-END:variables
}
