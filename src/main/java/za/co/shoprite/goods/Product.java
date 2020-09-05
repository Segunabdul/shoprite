package za.co.shoprite.goods;

import java.util.Scanner;

public class Product{

private String productName;

private long barcode;

private  String manufactureDate;

private String expiryDate;

private int quantity;

private double price;

public void setProductName (String productName){
this.productName = productName;
}
public String getProductName (){
return productName;
}

public void setBarcode (long barcode){
this.barcode = barcode;
}
public long getBarcode () {
return barcode;
}

public void setManufactureDate (String manufactureDate){
this.manufactureDate = manufactureDate;
}
public String getManufactureDate () {
return manufactureDate;
}

public void setExpiryDate (String expiryDate) {
this.expiryDate = expiryDate;
}
public String getExpiryDate (){
return expiryDate;
}

public void setQuantity (int quantity) {
this.quantity = quantity;
}
public int getQuantity  () {
return quantity;
}

public void setPrice (double price) {
this.price = price;
}
public double getPrice () {
return price; 
}
public Product (){
}

public void addProduct(String productName,long barcode,String manufactureDate,String expiryDate,int quantity,double price){

this.productName = productName;
this.barcode = barcode;
this.manufactureDate = manufactureDate;
this.expiryDate = expiryDate;
this.quantity = quantity;
this.price = price;
}
public void display(){
System.out.println ("....................PRODUCT DETAILS.....................");                         
System.out.println ("Product Name = " + productName);
System.out.println("Barcode = " + barcode);
System.out.println("Manufacture Date = " + manufactureDate);
System.out.println("Expiry Date =" + expiryDate);
System.out.println("Quantity =" + quantity);
System.out.println ("Price = R" + price); 
System.out.println ("....................PRODUCT DETAILS....................");

}
public void display(Product products [ ]) {

for(int t = 0; t < products.length; t++){

if(products[t] != null){
System.out.println ("================= Registered Details================");
System.out.println ("Product Name = " + products[t].getProductName());
System.out.println("Barcode = " + products[t].getBarcode());
System.out.println("Manufacture Date = " + products[t].getManufactureDate());
System.out.println ("Expiry Date = " + products[t].getExpiryDate());
System.out.println ("Quantity =" + products[t].getQuantity());
System.out.println ("Price = R " + products[t].getPrice());
System.out.println ("================= Registered Details================");
}
}

}

}