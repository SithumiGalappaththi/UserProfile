package com.tsp.profile.Repo;

import com.tsp.profile.model.Accident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccidentRepo extends JpaRepository <Accident,Long> {
    List<Accident> findAll();

    Accident save(Accident accident);
}
