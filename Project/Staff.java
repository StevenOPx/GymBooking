package Project;

/***
 * Gym Booking System Mini-Project created on 15/11/2021
 * @author Steven Oprisan
 * @version 1.0
 */

public class Staff {
    private int staffID;
    private int password;
    private String staffType;

    /**
     * No-argument constructor
     */

    public Staff() {
        this(0, 0, "No data entered");
    }

    public Staff(int staffID, int password, String staffType) {
        setStaffID(staffID);
        setPassword(password);
        setStaffType(staffType);
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    @Override
    public String toString() {
        return  "Staff ID: " + getStaffID() +
                "\nPassword: " + getPassword() +
                "\nStaff Type: " + getStaffType()
                ;
    }
}
