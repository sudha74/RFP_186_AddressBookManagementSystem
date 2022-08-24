package com.bridgelabz.AddressBook.ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                '}';
    }

    void addContact() {
        Contacts contact = new Contacts();
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
        list.add(contact);
    }

    void editContact() {
        System.out.println("Enter the first name of person to edit");
        String firstName = scanner.next().toLowerCase();
        boolean found = false;
        for (Contacts contact : list) {
            if (firstName.equals(contact.getFirstName().toLowerCase())) {
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
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("no contact found");
        }
    }

    void deleteContact() {
        System.out.println("Enter the first name of person to delete");
        String firstName = scanner.next().toLowerCase();
        boolean found = false;
        for (Contacts contact : list) {
            if (firstName.equals(contact.getFirstName().toLowerCase())) {
                list.remove(contact);
                found = true;
                System.out.println("Contact deleted successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("no contact found");
        }
    }

    void displayContacts() {
        if (list.isEmpty()) {
            System.out.println("no contacts to display");
        } else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }
    }
}
