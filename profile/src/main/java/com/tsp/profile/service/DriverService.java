package com.tsp.profile.service;

import com.tsp.profile.Repo.DriverRepo;
import com.tsp.profile.exception.UserNotFoundException;
import com.tsp.profile.model.Driver;
import com.tsp.profile.model.Passenger;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DriverService {

    private final DriverRepo driverRepo;

    @Autowired
    public DriverService(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }

    public List<Driver> findAllDrivers() {
        return driverRepo.findAll();
    }

    public Driver findDriverById(Long id) {
        return driverRepo.findDriverById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public Driver addDriver(Driver driver) {
        return driverRepo.save(driver);
    }
    public Driver updateDriver(Long id, Driver driver) {
        Driver driver1 = driverRepo.findDriverById(id).get();
        driver1.setFirstName(driver.getFirstName());
        driver1.setLastName(driver.getLastName());
        driver1.setEmail(driver.getEmail());
        driver1.setMobile(driver.getMobile());
        driver1.setPassword(driver.getPassword());
        driver1.setLocation(driver.getLocation());
        driver1.setNic(driver.getNic());
        driver1.setLicence(driver.getLicence());
        return driverRepo.save(driver1);
    }

    public void deleteDriver(Long id) {
        driverRepo.deleteDriverById(id);
    }
}
