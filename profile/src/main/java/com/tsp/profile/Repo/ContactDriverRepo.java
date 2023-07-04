package com.tsp.profile.Repo;

import com.tsp.profile.model.ContactDriver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactDriverRepo extends JpaRepository<ContactDriver,Long> {
    List<ContactDriver> findAll();

    ContactDriver save(ContactDriver contactDriver);
}
