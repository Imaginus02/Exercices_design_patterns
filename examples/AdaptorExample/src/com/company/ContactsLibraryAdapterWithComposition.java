package com.company;

import com.solution.implementations.ContactsLibraryAdapter2;
import org.thirdparty.ContactsLibrary;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/** Composition adapter */
public class ContactsLibraryAdapterWithComposition implements ContactsGetterInterface {

    private ContactsLibrary contactsLibrary;

    public ContactsLibraryAdapterWithComposition(ContactsLibrary contactsLibrary) {
        this.contactsLibrary = contactsLibrary;
    }

    @Override
    public AbstractList<Contact> getContacts() {
        LinkedHashMap<String, String> contacts = this.contactsLibrary.fetchContacts();
        ArrayList<Contact> results = new ArrayList<>();

        Iterator<String> iterator = contacts.keySet().iterator();
        while(iterator.hasNext()) {
            String contactName = iterator.next();
            String contactPhone = contacts.get(contactName);
            Contact myContact = new Contact(contactName, contactPhone);
            results.add(myContact);
        }

        return results;
    }
}