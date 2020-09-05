package za.co.shoprite.people;

import za.co.shoprite.people.Person;

import java.util.Scanner;

public class Employee extends Person{

private String userName;

private String password;

private String position;

public void setUserName (String userName){
this.userName = userName;
}
public String getUserName () {
return userName;
}
public void setPassword (String password){
this.password = password;
}
public String getPassword (){
return password;
}
public void setPosition (String position){
this.position = position;
}
public String getPosition () {
return position;
}

public Employee () {
}

//public void running(String name,int age){
//System.out.println (name +" is running");
//}

public void registerEmployee (String userName,String password,String position,String name,int age,long idNumber,long phoneNumber,String emailAddress,String gender) {
this.userName = userName;
this.password = password;
this.position = position;
setName(name);
setAge(age);
setIdNumber (idNumber);
setPhoneNumber(phoneNumber);
setEmailAddress (emailAddress);
setGender (gender);
}
public void display() {
System.out.println ("================= Registered Details================");
System.out.println ("UserName = " + userName);
System.out.println("Password = " + password);
System.out.println("Position = " + position);
System.out.println ("Name = " + getName());
System.out.println ("Age =" + getAge());
System.out.println ("Id Number = " + getIdNumber());
System.out.println ("Phone Number = " + getPhoneNumber());
System.out.println ("Email Address =" +getEmailAddress());
System.out.println ("Gender = " + getGender());
System.out.println ("================= Registered Details================");
}


public void display(Employee employees [ ]) {

for(int a = 0; a < employees.length; a++){

if(employees[a] != null){
System.out.println ("================= Registered Details================");
System.out.println ("UserName = " + employees[a].getUserName());
System.out.println("Password = " + employees[a].getPassword());
System.out.println("Position = " + employees[a].getPosition());
System.out.println ("Name = " + employees[a].getName());
System.out.println ("Age =" + employees[a].getAge());
System.out.println ("Id Number = " + employees[a].getIdNumber());
System.out.println ("Phone Number = " + employees[a].getPhoneNumber());
System.out.println ("Email Address =" +employees[a].getEmailAddress());
System.out.println ("Gender = " + employees[a].getGender());
System.out.println ("================= Registered Details================");
}
}

}
}