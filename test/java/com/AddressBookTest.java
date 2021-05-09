package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BooleanSupplier;

public class AddressBookTest {

    public AddressBook addressBook;

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        AddressBook addressBookMain = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List isadded = addressBookMain.addContact(contact);
        Assertions.assertTrue((BooleanSupplier) isadded);
    }

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_false(){
        AddressBook addressBookMain = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List<Contact> notadded = addressBookMain.addContact(contact);
        Assertions.assertTrue((BooleanSupplier) notadded);
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_true(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List<Contact> contactList = addressBook.addContact(contact);
        Contact editContact = addressBook.editContact(contactList, "SIYA", "address","Civil Line");
        Assertions.assertEquals("Civil Line", editContact.address);
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_false(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List<Contact> contactList = addressBook.addContact(contact);
        Contact editContact = addressBook.editContact(contactList, "SIYA", "address","Chandni Chowk");
        Assertions.assertEquals("Civil Line", editContact.address);
    }
}
