/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class Client {
    private char clientNo;
    private String fName;
    private String lName;
    private char telNo;
    private String prefType;
    private int maxRent;
    private String email;

    public Client() {
    }

    public Client(char clientNo, String fName, String lName, char telNo, String prefType, int maxRent, String email) {
        this.clientNo = clientNo;
        this.fName = fName;
        this.lName = lName;
        this.telNo = telNo;
        this.prefType = prefType;
        this.maxRent = maxRent;
        this.email = email;
    }

    public char getClientNo() {
        return clientNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public char getTelNo() {
        return telNo;
    }

    public String getPrefType() {
        return prefType;
    }

    public int getMaxRent() {
        return maxRent;
    }

    public String getEmail() {
        return email;
    }

    public void setClientNo(char clientNo) {
        this.clientNo = clientNo;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setTelNo(char telNo) {
        this.telNo = telNo;
    }

    public void setPrefType(String prefType) {
        this.prefType = prefType;
    }

    public void setMaxRent(int maxRent) {
        this.maxRent = maxRent;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" + "clientNo=" + clientNo + ", fName=" + fName + ", lName=" + lName + ", telNo=" + telNo + ", prefType=" + prefType + ", maxRent=" + maxRent + ", email=" + email + '}';
    }
    
}
