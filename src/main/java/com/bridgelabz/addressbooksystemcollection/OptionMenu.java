package com.bridgelabz.addressbooksystemcollection;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu {
	public void operation(List<detailsAddressBook> a, Map<String, List<detailsAddressBook>> addressBook,
			String newBook) {
		Scanner scanner = new Scanner(System.in);
		AddOrRemove addOrRemove = new AddOrRemove();
            boolean run = true;
		while (run) {

			System.out.println("\nWhat would u like to do with contacts? \n" + 
			        "1. ADD     \n" + 
					"2. DISPLAY \n" + 
					"3. EDIT    \n" + 
					"4. REMOVE  \n" + 
					"0. EXIT    \n");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				List<detailsAddressBook>multiContactInBook = addOrRemove.addPerson();
				addressBook.put(newBook, multiContactInBook);
				break;

			case 2:
				addOrRemove.displayPerson();
				break;
			case 3:
				addOrRemove.editPerson();
				break;
			case 4:
				addOrRemove.removePerson();
				break;

			default:
				run = false;
				System.out.println("You exit from Address Book Program");
				break;
			}
		}
	}
}