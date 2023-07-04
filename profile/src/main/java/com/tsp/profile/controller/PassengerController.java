package com.tsp.profile.controller;

import com.tsp.profile.model.Passenger;
import com.tsp.profile.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200") // to connet to the front end
//Get the http request and send the data to the client
@RestController //this is a rest service
@RequestMapping("/passenger")
public class PassengerController {
    private final PassengerService passengerService;

    @Autowired//service class and object class dependencys inject
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Passenger>> getAllPassengers () {
        List<Passenger> passengers = passengerService.findAllPassengers();
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable("id") Long id) {
        Passenger passenger = passengerService.findPassengerById(id);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }


    @PostMapping("/add") //change the backend
    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
        Passenger newPassenger = passengerService.addPassenger(passenger);
        return new ResponseEntity<>(newPassenger, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable("id") Long id,@RequestBody Passenger passenger) {
        Passenger updatePassenger = passengerService.updatePassenger(id,passenger);
        return new ResponseEntity<>(updatePassenger, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePassenger(@PathVariable("id") Long id) {
        passengerService.deletePassenger(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
