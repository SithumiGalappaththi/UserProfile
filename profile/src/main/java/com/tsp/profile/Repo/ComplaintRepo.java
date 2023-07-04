package com.tsp.profile.Repo;

import com.tsp.profile.model.Complaint;
import com.tsp.profile.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepo extends JpaRepository<Complaint,Long> {
    List<Complaint> findAll();

    Complaint save(Complaint complaint);
}
