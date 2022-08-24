package com.bridgelabz.AddressBook.ManagementSystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Address Book Management System");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean exist = true;
        do {
            System.out.println("Enter options:\n1) To add contact \n2) :To edit contact \n3):To display Contacts \n4):To delete contact \n5):To exit ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    exist = false;
                default:
                    break;
            }
        } while (exist);
    }
}

