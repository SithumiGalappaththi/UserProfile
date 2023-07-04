package com.tsp.profile.controller;

import com.tsp.profile.model.Lost;
import com.tsp.profile.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/lost")
public class LostController {
    private final LostService lostService;

    @Autowired
    public LostController(LostService lostService) {
        this.lostService = lostService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Lost>> getAllLost () {
        List<Lost> losts = lostService.findAllLost();
        return new ResponseEntity<>(losts, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Lost> createLost(@RequestBody Lost lost) {
        Lost newLost = lostService.addLost(lost);
        return new ResponseEntity<>(newLost, HttpStatus.CREATED);
    }
}
