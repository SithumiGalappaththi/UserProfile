package com.tsp.profile.Repo;

import com.tsp.profile.model.Driver;
import com.tsp.profile.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepo extends JpaRepository<Driver, Long> {
    Optional<Driver> findDriverById(Long id);
    void deleteDriverById(Long id);
}
