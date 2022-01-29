package BookShop;

 public class User {
private int userID;
private String userPassword;
private String userType;
private String UserName;
    public User(int userID, String userPassword, String userType, String userName) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userType = userType;
        UserName = userName;
    }

     public int getUserID() {
         return userID;
     }

     public String getUserPassword() {
         return userPassword;
     }

     public String getUserType() {
         return userType;
     }

     public String getUserName() {
         return UserName;
     }
 }
