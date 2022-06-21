/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class ClientM {
    private String clientNo;
    private String fName;
    private String lName;
    private String telNo;
    private String prefType;
    private int maxRent;
    private String email;

    public ClientM(){}

    public ClientM(String clientNo, String fName, String lName, String telNo, String prefType, int maxRent, String email) {
        super();
        this.clientNo = clientNo;
        this.fName = fName;
        this.lName = lName;
        this.telNo = telNo;
        this.prefType = prefType;
        this.maxRent = maxRent;
        this.email = email;
    }

    public String getClientNo() {
        return clientNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getTelNo() {
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

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setTelNo(String telNo) {
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
