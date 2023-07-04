package com.tsp.profile.controller;

import com.tsp.profile.model.Driver;
import com.tsp.profile.model.Passenger;
import com.tsp.profile.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Driver>> getAllDrivers () {
        List<Driver> drivers = driverService.findAllDrivers();
        return new ResponseEntity<>(drivers, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable("id") Long id) {
        Driver driver = driverService.findDriverById(id);
        return new ResponseEntity<>(driver, HttpStatus.OK);
    }


    @PostMapping("/add") //change the backend
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        Driver newDriver = driverService.addDriver(driver);
        return new ResponseEntity<>(newDriver, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable("id") Long id,@RequestBody Driver driver) {
        Driver updateDriver = driverService.updateDriver(id,driver);
        return new ResponseEntity<>(updateDriver, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDriver(@PathVariable("id") Long id) {
        driverService.deleteDriver(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

