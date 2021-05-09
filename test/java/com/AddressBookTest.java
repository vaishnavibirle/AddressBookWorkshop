package com;

import com.AddressBook;
import com.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    @Test
    public void givenContactName_whenDeleted_ShouldReturn_true(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List<Contact> contactList = addressBook.addContact(contact);
        List<Contact> deleteContactList = addressBook.deleteContact(contactList, "SIYA");
        Assertions.assertEquals(0, deleteContactList.size());
    }

    @Test
    public void givenContactName_whenDeleted_ShouldReturn_false(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        List<Contact> contactList = addressBook.addContact(contact);
        List<Contact> deleteContactList = addressBook.deleteContact(contactList, "Sam");
        Assertions.assertEquals(0, deleteContactList.size());
    }

    @Test
    public void givenListOfContacts_whenAdded_ShouldReturn_false() {
        AddressBook addressBook = new AddressBook();
        List<Contact> contactDataList = new ArrayList<>();
        contactDataList.add(new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com"));
        contactDataList.add(new Contact("Yash", "Pareek", "Ekdant", "Akola", "MH", 442001, 879459789, "yash@gmail.com"));
        contactDataList.add(new Contact("Vaishnavi", "Birle", "Purva Nagar", "Akot", "MH", 442001, 974507356, "vaishnavi@gmail.com"));
        List<Contact> contactList = addressBook.addContactList(contactDataList);
        Assertions.assertEquals(3, contactList.size());
    }

    @Test
    public void givenListOfContacts_whenAdded_ShouldReturn_true() {
        AddressBook addressBook = new AddressBook();
        List<Contact> contactDataList = new ArrayList<>();
        contactDataList.add(new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com"));
        contactDataList.add(new Contact("Yash", "Pareek", "Ekdant", "Akola", "MH", 442001, 879459789, "yash@gmail.com"));
        contactDataList.add(new Contact("Vaishnavi", "Birle", "Purva Nagar", "Akot", "MH", 442001, 974507356, "vaishnavi@gmail.com"));
        List<Contact> contactList = addressBook.addContactList(contactDataList);
        Assertions.assertEquals(0, contactList.size());
    }
}
