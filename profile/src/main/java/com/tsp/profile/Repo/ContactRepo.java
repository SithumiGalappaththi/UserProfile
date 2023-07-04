package com.tsp.profile.Repo;

import com.tsp.profile.model.Contact;
import com.tsp.profile.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact,Long>{
    List<Contact> findAll();

    Contact save(Contact contact);

}
