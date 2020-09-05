package za.co.shoprite.application;

import za.co.shoprite.people.Person;

import za.co.shoprite.people.Employee;

import za.co.shoprite.goods.Product;

import za.co.shoprite.goods.Supplier;

import java.util.Scanner;

public class Application{

public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

Employee employees [ ] = new Employee [10];

Employee employee = new Employee();

Product products [] = new Product [1000];

Product product = new Product();

int index =0;
///loop starts
for (int a = 0; a <= 10 ; a++){
 
System.out.println("Select Option");

System.out.println("1. Register");
System.out.println("2. Login");
System.out.println("3. Exit");
System.out.println("4. Display Registered Employee");

System.out.println ("Enter option:");
int option = scanner.nextInt ();

if (option == 1){ 

employee = new Employee();

scanner.nextLine();
System.out.println ("Enter userName:");
String userName = scanner.nextLine ();

System.out.println("Enter password:");
String password = scanner.nextLine ();

System.out.println("Enter position:");
String position = scanner.nextLine ();

System.out.println ("Enter name:");
String name = scanner.nextLine ();

System.out.println ("Enter age:");
int age = scanner.nextInt ();

System.out.println ("Enter idNumber:");
long idNumber = scanner.nextLong ();

System.out.println ("Enter phoneNumber:");
long phoneNumber = scanner.nextLong ();

System.out.println ("Enter emailAddress:");
String emailAddress = scanner.nextLine ();

System.out.println ("Enter gender:");
String gender = scanner.nextLine ();

employee.registerEmployee (userName,password,position,name,age,idNumber,phoneNumber,emailAddress,gender);
employee.display();

employees [index] = employee;
index++;
}//End of Option 1 Statement;

if (option == 2){
System.out.println ("Login Here");
scanner.nextLine();
System.out.println ("Username");
String uName = scanner.nextLine();
scanner.nextLine();
System.out.println ("Password");
String pword = scanner.nextLine();

for(int b = 0; b< employees.length;b++){

if(employees[b].getUserName().equals(uName)
&& (employees[b].getPassword().equals(pword)) && employees[b].getPosition().equalsIgnoreCase("manager")){

System.out.println("Login Successful As MANAGER");

for (int c = 0; c <= 1000; c++){

System.out.println("Select Product Option");

System.out.println("1. Add Products");
System.out.println("2. Display Products");
System.out.println("3. Exit");

System.out.println ("Enter productoption:");
int productoption = scanner.nextInt ();

if (productoption == 1){

product = new Product ();

System.out.println("Enter productName:");
String productName = scanner.nextLine ();
scanner.nextLine();

System.out.println ("Enter barcode:");
long barcode = scanner.nextLong ();

System.out.println ("Enter manufactureDate:");
String manufactureDate = scanner.nextLine ();
scanner.nextLine();

System.out.println ("Enter expiryDate:");
String expiryDate = scanner.nextLine ();

System.out.println ("Enter quantity:");
int quantity = scanner.nextInt();

System.out.println ("Enter price: R");
double price = scanner.nextDouble ();

product.addProduct(productName,barcode,manufactureDate,expiryDate,quantity,price);
product.display ();

products [index] = product;
index++;
b = 90;
}
if (productoption == 2){

product.display (products);

//////
//////////

}
}
}
else if (employees[b].getUserName().equals(uName)
&& (employees[b].getPassword().equals(pword)) && employees[b].getPosition().equalsIgnoreCase("teller")){

System.out.println("Login Successful As TELLER");









b = 80;
}
else if (!employees[b].getUserName().equals(uName)
 && (!employees[b].getPassword().equals(pword))  ){ 

System.out.println ("Login UnSuccessful");


}

}//End of Option 2 Loop


}
if (option == 3) {

a =11;
//exit;
//End of Option 3 Statement;
}//first loop ends;
if (option == 4) {
employee.display(employees);

}
}//End of loop.
}// End of main Method
}// End of class;

