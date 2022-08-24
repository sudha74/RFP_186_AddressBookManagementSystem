package com.bridgelabz.AddressBook.ManagementSystem;

import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner scanner = new Scanner(System.in);

    void addContact() {

        System.out.println("Enter firstName");
        contact.setFirstName(scanner.next());
        System.out.println("Enter lastName");
        contact.setLastName(scanner.next());
        System.out.println("Enter city");
        contact.setCity(scanner.next());
        System.out.println("Enter state");
        contact.setState(scanner.next());
        System.out.println("Enter address");
        scanner.nextLine();
        contact.setAddress(scanner.nextLine());
        System.out.println("Enter ZipCode");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter phoneNumber");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter email address");
        contact.setEmai(scanner.next());
    }

    Contacts display() {
        return contact;
    }
}
