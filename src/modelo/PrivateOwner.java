/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class PrivateOwner {
    private char ownerNo;
    private String fName;
    private String lName;
    private String address;
    private char telNo;
    private String email;
    private String password;

    public PrivateOwner() {
    }

    public PrivateOwner(char ownerNo, String fName, String lName, String address, char telNo, String email, String password) {
        this.ownerNo = ownerNo;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.telNo = telNo;
        this.email = email;
        this.password = password;
    }

    public char getOwnerNo() {
        return ownerNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public char getTelNo() {
        return telNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setOwnerNo(char ownerNo) {
        this.ownerNo = ownerNo;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNo(char telNo) {
        this.telNo = telNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PrivateOwner{" + "ownerNo=" + ownerNo + ", fName=" + fName + ", lName=" + lName + ", address=" + address + ", telNo=" + telNo + ", email=" + email + ", password=" + password + '}';
    }
    
}
