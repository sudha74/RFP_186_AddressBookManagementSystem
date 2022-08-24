package com.bridgelabz.AddressBook.ManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        HashMap<String, AddressBook> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Address Book Management System");


        boolean exist = true;
        while (exist) {
            AddressBook addressBook = new AddressBook();
            System.out.println("Enter address book name");
            String addressBookName = scanner.next().toLowerCase();
            if (map.containsKey(addressBookName)) {
                System.out.println("address book already exist");
            } else {
                map.put(addressBookName, addressBook);
            }
            System.out.println("Enter options:\n1) To add contact \n2) :To edit contact \n3):To display Contacts \n4):To delete contact \n5):To exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    map.get(addressBookName).addContact();
                    break;
                case 2:
                    map.get(addressBookName).editContact();
                    break;
                case 3:
                    map.get(addressBookName).displayContacts();
                    break;
                case 4:
                    map.get(addressBookName).deleteContact();
                    break;
                case 5:
                    exist = false;
                default:
                    break;
            }
        }
        System.out.println(map);
    }
}

