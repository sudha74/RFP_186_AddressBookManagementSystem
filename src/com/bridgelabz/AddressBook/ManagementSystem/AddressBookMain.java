package com.bridgelabz.AddressBook.ManagementSystem;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Address Book Management System");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println(addressBook.display());
        addressBook.editContact();
        System.out.println(addressBook.display());
        addressBook.deleteContact();
        System.out.println(addressBook.display());

    }
}
