package com.tsp.profile.service;

import com.tsp.profile.Repo.ContactRepo;
import com.tsp.profile.model.Contact;
import com.tsp.profile.model.Passenger;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ContactService {
    public final ContactRepo contactRepo;

    @Autowired
    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public List<Contact> findAllContact() {
        return contactRepo.findAll();
    }

    public Contact addContact(Contact contact) {
        return contactRepo.save(contact);
    }
}
