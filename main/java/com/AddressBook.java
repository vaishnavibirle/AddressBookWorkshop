package com;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public List<Contact> contactList;


    /*Adding Welcome Message
    *Creating Contact class to creating contact in addressbook*
    *Adding Contacts in Address Book
    * Editing contact details in Address Book*/
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public List<Contact> addContact(Contact contact) {
        System.out.println(contact);
        List<Contact> contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            System.out.println(contactList);
            return contactList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public Contact editContact(List<Contact> contactList, String name, String fieldName, String edit) {
        try {
            for(Contact contact : contactList){
                if(contact.firstName.equals(name)) {
                    switch(fieldName) {
                        case "firstName":
                            contact.firstName = edit;
                            break;
                        case "lastName":
                            contact.lastName = edit;
                            break;
                        case "address":
                            contact.address = edit;
                            break;
                        case "city":
                            contact.city = edit;
                            break;
                        case "state":
                            contact.state = edit;
                            break;
                        case "zip":
                            contact.zip = Integer.parseInt(edit);
                            break;
                        case "phone":
                            contact.phone = Long.parseLong(edit);
                            break;
                        case "email":
                            contact.email = edit;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

