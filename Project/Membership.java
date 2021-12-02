package Project;

import java.io.Serializable;

/***
 * Gym Booking System Mini-Project created on 15/11/2021
 * @author Steven Oprisan
 * @version 1.0
 */

public class Membership implements Serializable {

   private String memberName;
   private int memberDOB;
   private String membershipType;
   private double price;

    /**
     * No-argument constructor
     */
    public Membership() {
        this("Not Entered", 0, "Not selected", 0);
    }

    /**
     * The 4-arguments constructor
     * @param memberName - The name of the Member
     * @param memberDOB - The Member's date of birth
     * @param membershipType - The membership type
     * @param price - The price of the membership
     */
    public Membership(String memberName, int memberDOB, String membershipType, double price) {
        setMemberName(memberName);
        setMemberDOB(memberDOB);
        setMembershipType(membershipType);
        setPrice(price);
    }

    /**
     * Accessor method that returns the member's name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Mutator method to set the member's name
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Accessor method that returns the member's date of birth
     */
    public int getMemberDOB() {
        return memberDOB;
    }

    /**
     * Mutator method to set the member's date of birth
     */
    public void setMemberDOB(int memberDOB) {
        this.memberDOB = memberDOB;
    }

    /**
     * Accessor method that returns the member's membership type
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Mutator method to set the member's membership type
     */
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * Accessor method that returns the member's membership price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mutator method to set the member's membership price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Member Name: " + getMemberName() +
                "\n\nMember Date of Birth: " + getMemberDOB() +
                "\n\nMembership Type: " + getMembershipType() +
                "\n\nPrice: " + getPrice();
    }
}
