/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package purchaseordermanagementsystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YAO FENG PC
 */
public class Register_GUI extends javax.swing.JFrame {
    Administrator admin;
    /**
     * Creates new form Register_GUI
     */
    String[] userTypeSelection = {"Admin","SaleManager","PurchaseManager"};
    
    
    public Register_GUI(Administrator admin) {
        this.admin = admin;
        initComponents();
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Label_Name = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Label_Phone = new javax.swing.JLabel();
        Text_Name = new javax.swing.JTextField();
        Text_Password = new javax.swing.JTextField();
        Text_Email = new javax.swing.JTextField();
        Text_Phone = new javax.swing.JTextField();
        jLabel_UserType = new javax.swing.JLabel();
        ComboBox_UserType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        Button_Save = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Name.setText("Name:");

        Label_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Password.setText("Password:");

        Label_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Email.setText("Email:");

        Label_Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Phone.setText("Phone:");

        Text_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NameActionPerformed(evt);
            }
        });

        Text_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_PasswordActionPerformed(evt);
            }
        });

        Text_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_EmailActionPerformed(evt);
            }
        });

        jLabel_UserType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_UserType.setText("User Type:");

        ComboBox_UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sale Manger", "Purchase Manager" }));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Name", "Password", "Email", "Phone", "UserType", "StaffID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UserTable);

        Button_Save.setText("Save");
        Button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SaveActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Register User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Label_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(ComboBox_UserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(185, 185, 185)
                                .addComponent(Button_Save)))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Label_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_UserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Save)
                    .addComponent(backButton))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NameActionPerformed

    private void Text_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_PasswordActionPerformed

    private void Button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SaveActionPerformed
        if(Text_Name.getText().isEmpty()||Text_Password.getText().isEmpty()||Text_Email.getText().isEmpty()||Text_Phone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all the fields!!");
        }
        else{            
            String userID = admin.generateUserID();
            String name = Text_Name.getText().trim();
            String password = Text_Password.getText().trim();
            String email = Text_Email.getText().trim();
            String phone = Text_Phone.getText().trim();
            int comboBoxIndex = ComboBox_UserType.getSelectedIndex();
            String userType = userTypeSelection[comboBoxIndex];
            String staffID = admin.generatestaffID(userType);
            
            Administrator newAdmin = new Administrator(userID,name,password,email,phone,userType,staffID);            
            admin.registerUser(newAdmin);
            
            // Clean all the text field
            Text_Name.setText("");
            Text_Password.setText("");
            Text_Email.setText("");
            Text_Phone.setText("");
            
            // refresh the table
            removeTableRow();
            displayTable();   
        }   
    }//GEN-LAST:event_Button_SaveActionPerformed

    public void displayTable(){
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        FileManager getrow = new FileManager("User.txt");
        ArrayList<String> rows =  getrow.readFile();
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i).toString();
            String[] data = line.split("\\|");
            model.addRow(data);
        }
    }
    public void removeTableRow(){
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        int count = model.getRowCount();
        for (int i = count - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    
    private void Text_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_EmailActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Register_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Save;
    private javax.swing.JComboBox<String> ComboBox_UserType;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Name;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_Phone;
    private javax.swing.JTextField Text_Email;
    private javax.swing.JTextField Text_Name;
    private javax.swing.JTextField Text_Password;
    private javax.swing.JTextField Text_Phone;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_UserType;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}