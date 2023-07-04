package com.tsp.profile.Repo;

import com.tsp.profile.model.Contact;
import com.tsp.profile.model.Lost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LostRepo extends JpaRepository<Lost,Long> {
    List<Lost> findAll();

    Lost save(Lost lost);
}
