package BookShop;

public class Stock{
    private int stockID;
    private int stockQty;
    private Item item;

    public Stock(int stockID, int stockQty, Item item) {
        this.stockID = stockID;
        this.stockQty = stockQty;
        this.item = item;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public int getStockQty() {
        return stockQty;
    }
    public void stockInfo(){
        System.out.printf("StockID: %d, ItemID: %d, ItemName: %s, StockQty: %d\n",stockID,item.getItemID(),item.getItemName(),stockQty);
    }
}
