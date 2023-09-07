/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author YAO FENG PC
 */
public class ManageItem_GUI extends javax.swing.JFrame {
    private DefaultTableModel itemtable = new DefaultTableModel();
    private String [] itemColumn = {"Item Code","Item Name","Item Category","Item Unit Price","Quantity","Item Supplier ID"};
    private String[] itemCategories = {null,"Vegetable","Fruit","Meat","Dairy","Snacks","Beverages","Others"};
    private String[] supplierIDList = getSupplierIDFromFile();
    private SaleManager saleManager;
    private PurchaseManager purchaseManager;
    /**
     * Creates new form ViewItem_GUI
     */
    //Constructor overloading
    public ManageItem_GUI(SaleManager saleManager) {
        this.saleManager  = saleManager;
        initComponents();
        categoryComboBox.setModel(new DefaultComboBoxModel<>(itemCategories));
        supplierList.setListData(supplierIDList);
        displayTable();
    }
    public ManageItem_GUI(PurchaseManager purchaseManager) {
        this.purchaseManager  = purchaseManager;
        initComponents();
        categoryComboBox.setModel(new DefaultComboBoxModel<>(itemCategories));
        supplierList.setListData(supplierIDList);
        displayTable();
        
        addButton.setVisible(false);
        editButton.setVisible(false);
        removeButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemID", "Name", "Category", "Price", "Quantity", "SupplierID"
            }
        ));
        jScrollPane1.setViewportView(itemTable);

        supplierList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(supplierList);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Manage Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findButton)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addGap(40, 40, 40)
                        .addComponent(removeButton)
                        .addGap(40, 40, 40)
                        .addComponent(editButton)
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(removeButton)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        SaleManager_GUI saleManagerGUI = new SaleManager_GUI(saleManager);
        saleManagerGUI.show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddItem_GUI addItemGUI = new AddItem_GUI(saleManager);
        addItemGUI.show();
        dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int indexRow = itemTable.getSelectedRow();
        TableModel model = itemTable.getModel();
        String[] tableData = new String[itemTable.getColumnCount()];
        for(int i=0; i<itemTable.getColumnCount();i++){
            String data = model.getValueAt(indexRow, i).toString();
            tableData[i]=data;
        }
        Item item = new Item(tableData[0],tableData[1],tableData[2],tableData[3],tableData[4],tableData[5]);
        saleManager.manageItem("remove", item, item);
        this.removeTableRow();
        this.displayTable();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int indexRow = itemTable.getSelectedRow();
        TableModel model = itemTable.getModel();
        String[] tableData = new String[itemTable.getColumnCount()];
        for(int i=0; i<itemTable.getColumnCount();i++){
            String data = model.getValueAt(indexRow, i).toString();
            tableData[i]=data;
        }
        EditItem_GUI editItemGUI = new EditItem_GUI(saleManager,tableData);
        editItemGUI.show();
        dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        String filterTarget=null; 
        if(categoryComboBox.getSelectedIndex()==-1){
            filterTarget = null;
        }
        else{
            filterTarget = itemCategories[categoryComboBox.getSelectedIndex()];
        }
        String searchTarget = searchText.getText();
        //  All
        if (searchTarget.isBlank() && filterTarget==null){
            removeTableRow();
            displayTable();
        }
        // filter
        else if(searchTarget.isBlank() && filterTarget !=null){
            FileManager file = new FileManager("Item.txt");
            ArrayList<String[]> searchList = file.filterData(2, filterTarget);
            removeTableRow();
            displayTable(searchList);  
        }
        // search & Text
        else if(searchText !=null &&  filterTarget !=null){
            FileManager file = new FileManager("Item.txt");
            ArrayList<String[]> searchList = file.searchData(searchTarget);
            ArrayList<String[]> filterList = file.filterData(2, filterTarget);
            ArrayList<String[]> resultList = new ArrayList<String[]>(); ;
            for(int i = 0; i<searchList.size();i++){
                for(int j = 0; j<filterList.size();j++){
                    if(Arrays.equals(searchList.get(i),filterList.get(j)) == true){
                        resultList.add(searchList.get(i));               
                    }
                }
            }
            removeTableRow();
            displayTable(resultList);
        }
        else{
            FileManager file = new FileManager("Item.txt");
            ArrayList<String[]> searchList = file.searchData(searchTarget);
            removeTableRow();
            displayTable(searchList); 
        } 
    }//GEN-LAST:event_findButtonActionPerformed
    
    public String[] getSupplierIDFromFile(){
        FileManager file = new FileManager("Supplier.txt");
        ArrayList<String> userLine= file.readFile();
        String supplierIDLine="";//S00001|SR00002|.......
        for(int i=0 ; i<userLine.size();i++){
            String[] userData = userLine.get(i).split("\\|");
            supplierIDLine = supplierIDLine+userData[0]+"|";
        }
        String[] supplierIDList = supplierIDLine.split("\\|");
        return supplierIDList;
    } 
    public void displayTable(ArrayList<String[]> userData){
        //[{},{},{},....]
        //ArrayLIst with String Array
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        for(int i =0;i<userData.size();i++){
            model.addRow(userData.get(i));
        }
    }
    public void displayTable(){
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        FileManager getrow = new FileManager("Item.txt");
        ArrayList<String> rows =  getrow.readFile();
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i).toString();
            String[] data = line.split("\\|");
            model.addRow(data);
        }
    }
    public void removeTableRow(){
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        int count = model.getRowCount();
        for (int i = count - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SaleManager saleManager = new SaleManager("U00002","SM01","SM1234","SM01@gmail.com","0134567890","SaleManager","S00001");
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
            java.util.logging.Logger.getLogger(ManageItem_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageItem_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageItem_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageItem_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageItem_GUI(saleManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton editButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JList<String> supplierList;
    // End of variables declaration//GEN-END:variables
}
