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
        contact.setEmail(scanner.next());
    }

    void editContact() {
        System.out.println("Enter the first name of person to edit");
        String firstName = scanner.next();
        if (firstName.equals(contact.getFirstName())) {
            System.out.println("Edit the details of person");
            System.out.println("Enter firstName");
            contact.setFirstName(scanner.next());

            System.out.println("Enter lastName");
            contact.setLastName(scanner.next());

            System.out.println("Enter email");
            contact.setEmail(scanner.next());

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

        } else {
            System.out.println("person not found");
        }
    }

    void deleteContact() {
        System.out.println("Enter the first name of person to delete");
        String firstName = scanner.next();
        if (firstName.equals(contact.getFirstName())) {
            contact = null;
        } else {
            System.out.println("no contact found");
        }
    }

    Contacts display() {
        return contact;
    }
}
