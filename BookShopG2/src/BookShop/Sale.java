package BookShop;

public class Sale {
    private int saleID;
    private double saleAmount;
    private String saleDate;

    public Sale(int saleID, double saleAmount, String saleDate) {
        this.saleID = saleID;
        this.saleAmount = saleAmount;
        this.saleDate = saleDate;
    }
   public void saleInfo(){
       System.out.printf("SaleID: %d, SaleAmount: %.2f$, SaleDate: %s\n",saleID,saleAmount,saleDate);
   }
}
