package com.tsp.profile.service;

import com.tsp.profile.Repo.ContactDriverRepo;
import com.tsp.profile.Repo.ContactRepo;
import com.tsp.profile.model.Contact;
import com.tsp.profile.model.ContactDriver;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ContactDriverService {
    public final ContactDriverRepo contactDriverRepo;

    @Autowired
    public ContactDriverService(ContactDriverRepo contactDriverRepo) {
        this.contactDriverRepo = contactDriverRepo;
    }

    public List<ContactDriver> findAllContactDriver() {
        return contactDriverRepo.findAll();
    }

    public ContactDriver addContactDriver(ContactDriver contactDriver) {
        return contactDriverRepo.save(contactDriver);
    }
}
