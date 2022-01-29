package BookShop;

import java.util.ArrayList;

public class Receipt{
    private int receiptID;
    private ArrayList<Integer> quantity;
    private String receiptDate;
    private ArrayList<Item> items;
    private double totalAmount;
    private double total;
    private Staff staff;

    public Receipt(int receiptID, ArrayList<Integer> quantity, String receiptDate, ArrayList<Item> items,Staff staff) {
        this.receiptID = receiptID;
        this.quantity = quantity;
        this.receiptDate = receiptDate;
        this.items = items;
        this.staff=staff;
    }
    public void receiptInfo(){
        System.out.printf("ReceiptID: %d ,ReceiptDate: %s ,StaffID: %d\n",receiptID,receiptDate,staff.getStaffID());
        for(int i=0;i<items.size();i++){
            System.out.printf("ItemID: %d ,ItemName: %s ,Quantity: %d ,Price: %.2f$ ,TotalAmount: %.2f$\n",
                    items.get(i).getItemID(),items.get(i).getItemName(),quantity.get(i),
                    items.get(i).getSellingPrice(),items.get(i).getSellingPrice()*quantity.get(i));

        }
        System.out.printf("Total: %.2f$\n",total);
    }

    public int getReceiptID() {
        return receiptID;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public double getTotal() {
        for (int i=0;i<items.size();i++){
            total+=items.get(i).getSellingPrice()*quantity.get(i);
        }
        return total;
    }
}
