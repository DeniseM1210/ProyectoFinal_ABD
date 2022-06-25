/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class PropertyForRentM {
    private String propertyNo;
    private String street;
    private String city;
    private String postcode;
    private String type;
    private int rooms;
    private int rent;
    private String ownerNo;
    private String staffNo;
    private String branchNo;

    public PropertyForRentM() {
    }

    public PropertyForRentM(String propertyNo, String street, String city, String postcode, String type, int rooms, int rent, String ownerNo, String staffNo, String branchNo) {
        this.propertyNo = propertyNo;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.type = type;
        this.rooms = rooms;
        this.rent = rent;
        this.ownerNo = ownerNo;
        this.staffNo = staffNo;
        this.branchNo = branchNo;
    }

    public String getPropertyNo() {
        return propertyNo;
    }

    public void setPropertyNo(String propertyNo) {
        this.propertyNo = propertyNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    @Override
    public String toString() {
        return "PropertyForRentM{" + "propertyNo=" + propertyNo + ", street=" + street + ", city=" + city + ", postcode=" + postcode + ", type=" + type + ", rooms=" + rooms + ", rent=" + rent + ", ownerNo=" + ownerNo + ", staffNo=" + staffNo + ", branchNo=" + branchNo + '}';
    }
    
    
}
