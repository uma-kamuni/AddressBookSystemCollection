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

	public void editPerson() {
		System.out.println("Enter first name u want to edit:");
		String editName = scanner.nextLine();

		boolean found = false;
		for (detailsAddressBook details : detailsAddressBookArrayList) {
			if (details.getFirstName().equals(editName)) {
				found = true;
				System.out.println(details);

				System.out.println("What do u want to edit\n" + "1. First Nmae / 2. Last Nmae / 3. Address /4. City /"
						+ "5. State / 6. Zip code / 7. Phone Number / 8. Email");

				int choice = scanner.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter a new First Name:");
					String newFirstName = scanner.next();
					details.setFirstName(newFirstName);
					break;

				case 2:
					System.out.println("Enter a new Last Nmae:");
					String newLastName = scanner.next();
					details.setLastName(newLastName);
					break;

				case 3:
					System.out.println("Enter a new Address");
					String address = scanner.next();
					details.setAddress(address);
					break;

				case 4:
					System.out.println("Enter a new City");
					String city = scanner.next();
					details.setAddress(city);
					break;
				
				case 5:
					System.out.println("Enter a new State");
					String state = scanner.next();
					details.setState(state);
					break;
				
				case 6:
					System.out.println("Enter a new ZipCode");
					Long zip = scanner.nextLong();
					details.setZip(zip);
					break;
				
				case 7:
					System.out.println("Enter a new Phone Number");
					Long phoneNumber = scanner.nextLong();
					details.setPhoneNumber(phoneNumber);
					break;
				
				case 8:
					System.out.println("Enter a new Email Address");
					String email = scanner.next();
					details.setEmailAddress(email);
					break;
					
				default:
					System.out.println("You Press Wrong Option");

				}
			}
		}
		if (found) {
			System.out.println("Your Edit Choice Is Updated Successfully");
		} else {
			System.out.println("First Name is not found");
		}
	}
}