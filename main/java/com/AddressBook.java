package com;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public List<Contact> contactList;


    /*Adding Welcome Message
    *Creating Contact class to creating contact in addressbook*
    *Adding Contacts in Address Book*/
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public boolean addContact(Contact contact) {
        System.out.println(contact);
        List<Contact> contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            System.out.println(contactList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

