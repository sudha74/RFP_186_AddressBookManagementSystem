package com.bridgelabz.AddressBook.ManagementSystem;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Address Book Management System");
        Contacts contact = new Contacts();
        contact.setFirstName("Sudha");
        System.out.println(contact.getFirstName());
    }
}
