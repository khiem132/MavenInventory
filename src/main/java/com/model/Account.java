package com.model;
// Generated Oct 6, 2015 3:47:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private int id;
     private Roles roles;
     private String userName;
     private String password;
     private String staffName;
     private String phone;
     private String email;
     private String address;
     private Set bills = new HashSet(0);
     private Set orders = new HashSet(0);

    public Account() {
    }

	
    public Account(int id, Roles roles, String userName, String password, String staffName, String phone, String email, String address) {
        this.id = id;
        this.roles = roles;
        this.userName = userName;
        this.password = password;
        this.staffName = staffName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    public Account(int id, Roles roles, String userName, String password, String staffName, String phone, String email, String address, Set bills, Set orders) {
       this.id = id;
       this.roles = roles;
       this.userName = userName;
       this.password = password;
       this.staffName = staffName;
       this.phone = phone;
       this.email = email;
       this.address = address;
       this.bills = bills;
       this.orders = orders;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStaffName() {
        return this.staffName;
    }
    
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Set getBills() {
        return this.bills;
    }
    
    public void setBills(Set bills) {
        this.bills = bills;
    }
    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }




}


