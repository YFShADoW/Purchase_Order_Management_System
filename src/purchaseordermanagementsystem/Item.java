/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class Item {
    private String itemCode, itemCategory, itemName;
    private String supplierID;
    private float itemUnitPrice;
    private int itemStock;
    

    public Item(String itemCode, String itemName, String itemCategory, float itemUnitPrice, int itemStock, String supplierID) {
        this.itemCode = itemCode;
        this.itemCategory = itemCategory;
        this.itemName = itemName;
        this.itemUnitPrice = itemUnitPrice;
        this.itemStock = itemStock;
        this.supplierID = supplierID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSupplierID() {
        return supplierID;
    }


    public void setSupplier(String supplierID) {
        this.supplierID = supplierID;
    }

    public float getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(float itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    
    
    public void addItem(){
        String [] newitem = new Item {this.getItemCode(),this.getItemName(),this.getItemCategory(),this.getItemUnitPrice(),this.getItemStock(),this.getSupplierID()};
        FileManager file = new FileManager("Item.txt");
        file.addToFile(newitem);
    }

}
