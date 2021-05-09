package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    public AddressBook addressBook;

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        AddressBook addressBookMain = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        boolean isadded = addressBookMain.addContact(contact);
        Assertions.assertTrue(isadded);
    }

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_false(){
        AddressBook addressBookMain = new AddressBook();
        Contact contact = new Contact("SIYA", "Kapoor", "IUDP", "Amravati", "MH", 444601, 952772864, "siyas@gmail.com");
        boolean notadded = addressBookMain.addContact(contact);
        Assertions.assertTrue(notadded);
    }
}
