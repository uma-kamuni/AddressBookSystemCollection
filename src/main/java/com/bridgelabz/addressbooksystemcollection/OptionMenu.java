package com.bridgelabz.addressbooksystemcollection;

import java.util.Scanner;

public class OptionMenu {
    public void operation() {

        Scanner scanner = new Scanner(System.in);
        AddOrRemove addOrRemove = new AddOrRemove();

        while (true) {

            System.out.println("\nWhat would u like to do with contacts? \n" +
                    "1. ADD     \n" +
                    "2. DISPLAY \n" +
                    "3. EDIT    \n" +
                    "4. REMOVE  \n" +
                    "0. EXIT    \n");
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
                case 4:
                    addOrRemove.removePerson();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
}