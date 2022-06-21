/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class BranchM {
    private char branchNo;
    private String street;
    private String city;
    private String postcode;

    public BranchM() {
    }

    public BranchM(char branchNo, String street, String city, String postcode) {
        this.branchNo = branchNo;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public char getBranchNo() {
        return branchNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setBranchNo(char branchNo) {
        this.branchNo = branchNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Branch{" + "branchNo=" + branchNo + ", street=" + street + ", city=" + city + ", postcode=" + postcode + '}';
    }
    
    
}
