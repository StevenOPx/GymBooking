package Project;

/***
 * Gym Booking System Mini-Project
 * Created on 15/11/2021
 * @author Steven Oprisan
 * @version 1.0
 */

public class Member {
    private int memberID;
    private int password;
    private int memberAge;

    /**
     * No-argument constructor
     */

    public Member() {
        this(0, 0, 0);
    }

    /**
     * The 3-arguments constructor
     * @param memberID - The Member ID used to sign in
     * @param password -  The Member password used to sign in
     * @param memberAge - The age of the Member
     */

    public Member(int memberID, int password, int memberAge) {
        setMemberID(memberID);
        setPassword(password);
        setMemberAge(memberAge);
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    @Override
    public String toString() {
        return  "Member ID: " + getMemberID() +
                "\nPassword: " + getPassword() +
                "\nMember Age: " + getMemberID();
    }
}
