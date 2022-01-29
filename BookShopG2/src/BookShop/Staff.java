package BookShop;

public class Staff{
    private int staffID;
    private String staffName;
    private String position;
    private float salary;
    private User user;
    public Staff(int staffID, String staffName, String position, float salary, User user) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.position = position;
        this.salary = salary;
        this.user = user;
    }
    public int getStaffID() {
        return staffID;
    }
}
