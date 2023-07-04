package com.tsp.profile.Repo;

import com.tsp.profile.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
//used for managing the data in a Spring Boot Application
import java.util.Optional;

public interface PassengerRepo extends JpaRepository<Passenger, Long> { //class and the type of the primary key

    Optional<Passenger> findPassengerById(Long id);
    void deletePassengerById(Long id);
}
