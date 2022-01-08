package com.bridgelabz.addressbooksystemcollection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddorRemove {

	ArrayList<detailsAddressBook> detailsAddressBookArrayList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public ArrayList addPerson() {
		System.out.println("Enter following details \n First Name:");
		String firstName = scanner.next();
		System.out.println("Last Name:");
		String lastName = scanner.next();
		System.out.println("Address :");
		String address = scanner.next();
		System.out.println("City :");
		String city = scanner.next();
		System.out.println("State :");
		String state = scanner.next();
		System.out.println("Zip Code :");
		int zip = scanner.nextInt();
		System.out.println("Phone Number :");
		long phoneNumber = scanner.nextLong();
		System.out.println("Email :");
		String emailAddress = scanner.next();

		detailsAddressBook details = new detailsAddressBook();
		details.setFirstName(firstName);
		details.setLastName(lastName);
		details.setAddress(address);
		details.setCity(city);
		details.setState(state);
		details.setZip(zip);
		details.setPhoneNumber(phoneNumber);
		details.setEmailAddress(emailAddress);

		detailsAddressBookArrayList.add(details); // adding details data
		return detailsAddressBookArrayList;

	}

	public void displayPerson() {
		if (detailsAddressBookArrayList.size() == 0) {
			System.out.println("Address book Empty: You must add the deatils in Address Book Contact");
		} else {
			System.out.println("All contacts =" + detailsAddressBookArrayList.size());
			System.out.println(detailsAddressBookArrayList);
		}
	}

}
