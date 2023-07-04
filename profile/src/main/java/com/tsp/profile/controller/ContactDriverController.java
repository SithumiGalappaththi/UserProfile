package com.tsp.profile.controller;

import com.tsp.profile.model.Contact;
import com.tsp.profile.model.ContactDriver;
import com.tsp.profile.service.ContactDriverService;
import com.tsp.profile.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/contactDriver")
public class ContactDriverController {

    private final ContactDriverService contactDriverService;


    @Autowired
    public ContactDriverController(ContactDriverService contactDriverService) {
        this.contactDriverService = contactDriverService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<ContactDriver>> getAllContactDriver () {
        List<ContactDriver> contactDrivers = contactDriverService.findAllContactDriver();
        return new ResponseEntity<>(contactDrivers, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<ContactDriver> createContactDriver(@RequestBody ContactDriver contactDriver) {
        ContactDriver newContactDriver = contactDriverService.addContactDriver(contactDriver);
        return new ResponseEntity<>(newContactDriver, HttpStatus.CREATED);
    }
}
