package com.gla;

public class BusinessContact extends Contact{
    String companyName;
    BusinessContact(String name,String phoneNumber,String companyName){
        super(name, phoneNumber);
        this.companyName=companyName;
    }
    @Override
    void display(){
       System.out.println("Name:"+ name.toUpperCase());
       System.out.println("Phone number:"+phoneNumber);
       System.out.println("Company name:"+companyName);
    }
}
