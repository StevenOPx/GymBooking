package Project;

import java.io.Serializable;

/***
 * Gym Booking System Mini-Project created on 15/11/2021
 * @author Steven Oprisan
 * @version 1.0
 */

public class Booking implements Serializable {

    private String bookingType;
    private String bookingLocation;
    private int bookingLength;
    private String dayOfWeek;

    /**
     * No-argument constructor
     */
    public Booking() {
        this("Not Selected", "Not selected", 0, "Not selected");
    }

    /**
     * The 4-arguments constructor
     * @param classType - The type of Gym class
     * @param classLocation - The location of the Gym Class
     * @param classLength - The length of the Gym class
     * @param dayOfWeek - The day of week the Gym class will be held
     */
    public Booking(String classType, String classLocation, int classLength, String dayOfWeek) {
        setClassType(classType);
        setClassLocation(classLocation);
        setClassLength(classLength);
        setDayOfWeek(dayOfWeek);
    }

    public String getClassType() {
        return bookingType;
    }

    public void setClassType(String classType) {
        this.bookingType = classType;
    }

    public String getClassLocation() {
        return bookingLocation;
    }

    public void setClassLocation(String classLocation) {
        this.bookingLocation = classLocation;
    }

    public int getClassLength() {
        return bookingLength;
    }

    public void setClassLength(int classLength) {
        this.bookingLength = classLength;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return  "Booking Type: " + getClassType() +
                "\n\nBooking Location: " + getClassLocation() +
                "\n\nBooking Length: " + getClassLength() +
                "\n\nDay Of Week: " + getDayOfWeek();
    }
}
