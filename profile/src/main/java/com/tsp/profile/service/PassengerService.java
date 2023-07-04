package com.tsp.profile.service;

import com.tsp.profile.Repo.PassengerRepo;
import com.tsp.profile.exception.UserNotFoundException;
import com.tsp.profile.model.Passenger;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PassengerService {
    private final PassengerRepo passengerRepo; // for connect the passenger repo

    @Autowired //service and controller inject each other
    public PassengerService(PassengerRepo passengerRepo) {
        this.passengerRepo = passengerRepo;
    }

    public List<Passenger> findAllPassengers() {
        return passengerRepo.findAll();
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepo.save(passenger);
    }

    public Passenger updatePassenger(Long id, Passenger passenger) {
        Passenger passenger1 = passengerRepo.findPassengerById(id).get();
        passenger1.setFirstName(passenger.getFirstName());
        passenger1.setLastName(passenger.getLastName());
        passenger1.setEmail(passenger.getEmail());
        passenger1.setMobile(passenger.getMobile());
        passenger1.setPassword(passenger.getPassword());
        passenger1.setLocation(passenger.getLocation());
        passenger1.setAnotheremail(passenger.getAnotheremail());
        return passengerRepo.save(passenger1);
    }

    public Passenger findPassengerById(Long id) {
        return passengerRepo.findPassengerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePassenger(Long id) {
        passengerRepo.deletePassengerById(id);
    }
}
