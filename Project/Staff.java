package Project;

public class Staff {
    private int staffID;
    private int password;
    private String staffType;

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
