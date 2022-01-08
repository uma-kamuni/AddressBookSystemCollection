package com.bridgelabz.addressbooksystemcollection;
import java.util.Scanner;

public class AddressBookProgram {
	
    public static void getInput(){
    detailsAddressBook details= new detailsAddressBook();
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the following address details ");
        System.out.println("Enter First Name :");
        details.setFirstName(input.nextLine());
        System.out.println("First Name :"+details.getFirstName());
        System.out.println("Enter Last Name :");
        details.setLastName(input.nextLine());
        System.out.println("Last Name: "+details.getLastName());
        System.out.println("Enter Email Address :");
        details.setEmailAddress(input.nextLine());
        System.out.println("email address: "+details.getEmailAddress());
        System.out.println("Enter Address :");
        details.setAddress(input.nextLine());
        System.out.println("address: "+details.getAddress());
        System.out.println("Enter City :");
        details.setCity(input.nextLine());
        System.out.println("City :"+details.getCity());
        System.out.println("Enter State :");
        details.setState(input.nextLine());
        System.out.println("State:"+details.getState());
        System.out.println("Enter Zip :");
        details.setZip(input.nextLong());
        System.out.println("Zip:"+details.getZip());
        System.out.println("Enter Phone Number :");
        details.setPhoneNumber(input.nextLong());
        System.out.println("Phone Number:"+details.getPhoneNumber());
}




    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
        getInput();

    }
}