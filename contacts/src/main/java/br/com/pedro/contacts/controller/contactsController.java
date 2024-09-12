package br.com.pedro.contacts.controller;

import br.com.pedro.contacts.model.ContactsModel;
import br.com.pedro.contacts.services.ContactsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    ContactsServices contactsServices;

    @GetMapping("")
    public String contacts(){
        return "Hello World, here is contacts";
    }

    @PostMapping("")
    public ContactsModel createContact(@RequestBody ContactsModel contact) {
        return contactsServices.create(contact);
    }
}