package za.co.shoprite.goods;

import za.co.shoprite.goods.Product;

import java.util.Scanner;

public class Supplier{

private String supplierName;

private int age;

private long idNumber;

private long phoneNumber;

private String emailAddress;

private String officeAddress;

private Product product;

public void setSupplierName(String supplierName) {
this.supplierName = supplierName;
}
public String getSupplierName () {
return supplierName;
}

public void setAge (int age) {
this.age = age;
}
public int getAge () {
return age;
}

public void setIdNumber (long idNumber) {
this.idNumber = idNumber;
}
public long getIdNumber () {
return idNumber;
}

public void setPhoneNumber (long phoneNumber) {
this.phoneNumber = phoneNumber;
}
public long getPhoneNumber (){
return phoneNumber;
}

public void setEmailAddress (String emailAddress){
this.emailAddress = emailAddress;
}
public String getEmailAddress (){
return emailAddress;
}

public void setOfficeAddress (String officeAddress){
this.officeAddress = officeAddress;
}
public String getOfficeAddress () {
return officeAddress;
}

public void setProduct(Product product){
this.product = product;
}
public Product getProduct () {
return product;
} 


public Supplier (){
}

public void Supplier (String supplierName,int age,long idNumber,long phoneNumber, String emailAddress,String officeAddress,Product product){

this.supplierName = supplierName;
this.age = age;
this.idNumber = idNumber;
this.phoneNumber = phoneNumber;
this.emailAddress = emailAddress;
this.officeAddress = officeAddress;
this.product = product;
}
}
