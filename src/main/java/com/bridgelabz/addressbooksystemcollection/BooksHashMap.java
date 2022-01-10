package com.bridgelabz.addressbooksystemcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BooksHashMap {

	Map<String, List<detailsAddressBook>> addressBooks = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
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
				optionMenu.operation(contactList, addressBooks, newBookName);
				break;

			case 2:
				System.out.println(addressBooks.keySet());
				System.out.println("Which address book do u want to access?");
				String existingBook = scanner.next();
				if (addressBooks.containsKey(existingBook)) { // true if this map contains a mapping for the specifiedkey
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
			}
		}

	}
}