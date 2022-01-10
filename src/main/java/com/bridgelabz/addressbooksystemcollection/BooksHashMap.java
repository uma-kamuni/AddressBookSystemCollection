package com.bridgelabz.addressbooksystemcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BooksHashMap {

	Map<String, List<detailsAddressBook>> addressBooks = new HashMap<>();
	private final Scanner scanner = new Scanner(System.in);
	OptionMenu optionMenu = new OptionMenu();

	public void multipleAddressBook() {
		while (true) {
			System.out.println("What would u like to do? \n" + "1. Create new address book \n"
					+ "2. Continue with existing address book \n" + "3. All books \n" + "0. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter new name Address Book");
				String newBookName = scanner.next();
				List<detailsAddressBook> contactList = new ArrayList();
				if (addressBooks.containsKey(newBookName)) {
					System.out.println("Address book Nmae id Already Exist");
				} else {
					optionMenu.operation(contactList, addressBooks, newBookName);
				}
				break;

			case 2:
				System.out.println(addressBooks.keySet());
				System.out.println("Which address book do u want to access?");
				String existingBook = scanner.next();
				if (addressBooks.containsKey(existingBook)) { // true if this map contains a mapping for the
																// specifiedkey
					contactList = addressBooks.get(existingBook);
					optionMenu.operation(contactList, addressBooks, existingBook);
				} else
					System.out.println("Book not found");
				break;

			case 3:
				int serialNo = 1;
				for (String book : addressBooks.keySet()) {
					System.out.println(serialNo + ". " + book);
					serialNo++;
				}
				System.out.println("\n +addressBooks");
				break;

			case 4:
				System.out.println("Enter Name for City");
				String nameForCity = scanner.next();
				searchAcrossCity(nameForCity);
				break;

			default:
				System.exit(0);
				break;
			}
		}

	}

	private void searchAcrossCity(String contactsInCity) {
		for (String keyOfBook : addressBooks.keySet()) {
			addressBooks.get(keyOfBook)
			.stream()
			 .filter(contactInfo -> contactsInCity.equals(contactInfo.getCity()))
             .forEach(System.out::println);
		}
		
	}
	 @SuppressWarnings("unused")
	private void searchAcrossState(String contactsInState) {
	        for (String keyOfBook : addressBooks.keySet()) {
	            addressBooks.get(keyOfBook)
	                    .stream()
	                    .filter(contactInfo -> contactsInState.equals(contactInfo.getState()))
	                    .forEach(System.out::println);
	        }
	    }
	}