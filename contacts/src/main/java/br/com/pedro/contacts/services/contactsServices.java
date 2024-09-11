package br.com.pedro.contacts.services;

import br.com.pedro.contacts.model.ContactsModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactsServices {

    public List<ContactsModel> listContacts = new ArrayList<>();

    public ContactsModel create(ContactsModel contact) {
    //TODO: fazer implementação do id UUID
        listContacts.add(contact);
        return contact;
    }
}
