package BookShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    Scanner object for input data
    public static Scanner sc=new Scanner(System.in);
// Array list for sale
   public static ArrayList<Sale> sales=new ArrayList<>();

//    Array list for storing item
    public static ArrayList<Item> items=new ArrayList<>();
//    Array list quantity for each item
    public static ArrayList<Integer> quantity=new ArrayList<>();
//    Create Stock with item quantity
    public static ArrayList<Stock> stocks=new ArrayList<>();
//    Items' Data
    public static Item item1=new Item(1,"The Miracle Morning",10,15);
    public static Item item2=new Item(2,"Follow Your Heart",8,13);
    public static Item item3=new Item(3,"Black Pen",0.2f,0.5f);
    public static Item item4=new Item(4,"Pencil",0.2f,0.5f);
    public static void main(String[] args) {
        User user=new User(123,"user123","user","lol");
        Staff staff=new Staff(51,"Elon Musk","Space Engineering",50000,user);
        Receipt receipt=new Receipt(114,quantity,"25/01/2022",items,staff);
        stocks.add(new Stock(1,100,item1));
        stocks.add(new Stock(2,225,item2));
        stocks.add(new Stock(3,300,item3));
        stocks.add(new Stock(4,505,item4));
        int saleID=615;
        boolean checkUser;
        do {
            //        Input Username
            System.out.print("Username: ");
            String username=sc.nextLine();
//        Input Password
            System.out.print("Password: ");
            String password=sc.nextLine();
//        id variable for sale
            if (username.equals(user.getUserName()) && password.equals(user.getUserPassword())) {
                checkUser=true;
                menu();
                while (true) {
                    System.out.print("Please choose: ");
                    int order = sc.nextInt();
                    switch (order) {
                        case 1:
                            addReceipt();
                            sales.add(new Sale(saleID, receipt.getTotal(), receipt.getReceiptDate()));
                            saleID++;
                            break;
                        case 2:
                            receipt.receiptInfo();
                            break;
                        case 3:
                            showSale();
                            break;
                        case 4:
                            showStock();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                    }
                }
            } else {
                System.out.println("Data Invalid!!!");
                System.out.println("Please login again!");
                checkUser=false;
            }
        }while (!checkUser);

    }
//    Create menu for BookShop process.
     private static void menu(){
         System.out.println("1. Input Receipt.");
         System.out.println("2. Show Info Receipt");
         System.out.println("3. Show Info Sale");
         System.out.println("4. Show Stock info");
         System.out.println("5. Exit Application");
     }

//     Show stock
    private static void showStock(){
        for (int i=0;i<stocks.size();i++){
            stocks.get(i).stockInfo();
        }
    }

//     Show sale
    public static void showSale(){
         for (int i=0;i<sales.size();i++){
             sales.get(i).saleInfo();
         }
    }
    public static void addReceipt(){
//  User input for item that customer has bought.
        System.out.println("Enter number of Item that you would like to buy?");
        int n=sc.nextInt();

        boolean check;
        for(int i=0;i<n;i++) {
//            do while loop for checking when user input itemID that doesn't exist in the shop.
            do {
                //             User input quantity of items for each item

                System.out.print("Enter ItemID: ");
                int itemID = sc.nextInt();
                if (itemID == 1) {
                    items.add(item1);

                    check = true;
                } else if (itemID == 2) {
                    items.add(item2);
                    check = true;
                } else if (itemID == 3) {
                    items.add(item3);
                    check = true;
                } else if (itemID == 4) {
                    items.add(item4);
                    check = true;
                } else {
                    System.out.println("This item not found.");
                    System.out.println("Please choose Another ItemID.");
                    check = false;
                }
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                quantity.add(qty);
                stocks.get(itemID-1).setStockQty(stocks.get(itemID-1).getStockQty()-qty);
            } while (!check);

        }
    }
}
