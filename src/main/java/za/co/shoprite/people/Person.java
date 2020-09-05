package za.co.shoprite.people;

import java.util.Scanner;

public abstract class Person{

private String name;

private int age;

private long idNumber;

private long phoneNumber;

private String emailAddress;

private String gender;

public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
public void setAge(int age){
this.age = age;
}
public int getAge(){
return age;
}
public void setIdNumber (long idNumber){
this.idNumber = idNumber;
}
public long getIdNumber (){
return idNumber;
}
public void setPhoneNumber (long phoneNumber){
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
public void setGender (String gender){
this.gender = gender;
}
public String getGender () {
return gender;
}

public Person (){
}

public void Person (String name,int age,long idNumber,long phoneNumber,String emailAddress,String gender){

this.name = name;
this.age = age;
this.idNumber = idNumber;
this.phoneNumber = phoneNumber;
this.emailAddress = emailAddress;
this.gender = gender;

}

}


