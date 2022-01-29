package BookShop;

public class Item {
    private int itemID;
    private String itemName;
    private float importPrice;
    private float sellingPrice;

    public Item(int itemID, String itemName, float importPrice, float sellingPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.importPrice = importPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
