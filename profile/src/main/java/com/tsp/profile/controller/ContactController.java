package com.tsp.profile.controller;

import com.tsp.profile.model.Contact;
import com.tsp.profile.model.Driver;
import com.tsp.profile.service.ContactService;
import com.tsp.profile.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Contact>> getAllContact () {
        List<Contact> contacts = contactService.findAllContact();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact newContact = contactService.addContact(contact);
        return new ResponseEntity<>(newContact, HttpStatus.CREATED);
    }
}
