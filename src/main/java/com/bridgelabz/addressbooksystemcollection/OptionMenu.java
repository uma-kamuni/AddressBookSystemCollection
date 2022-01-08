package com.bridgelabz.addressbooksystemcollection;

import java.util.Scanner;

public class OptionMenu {
	public void operation() {
		Scanner scanner = new Scanner(System.in);
		AddorRemove addOrRemove = new AddorRemove();
		
		while (true) {
			
			System.out.println("\nWhat would u like to do with contacts?\n"+ 
			"1. Add     \n"+ 
			"2. DISPLAY \n"+ 
			"3. EDIT    \n"+ 
			"4. Exit    \n");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				addOrRemove.addPerson();
			break;
			
			case 2:
				addOrRemove.displayPerson();
				break;
			
			case 3:
				addOrRemove.editPerson();
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}

}