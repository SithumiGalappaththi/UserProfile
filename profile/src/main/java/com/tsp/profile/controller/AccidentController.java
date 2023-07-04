package com.tsp.profile.controller;

import com.tsp.profile.model.Accident;
import com.tsp.profile.model.Lost;
import com.tsp.profile.service.AccidentService;
import com.tsp.profile.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/accident")
public class AccidentController {

    private final AccidentService accidentService;

    @Autowired
    public AccidentController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Accident>> getAllAccident () {
        List<Accident> accidents = accidentService.findAllAccident();
        return new ResponseEntity<>(accidents, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Accident> createLost(@RequestBody Accident accident) {
        Accident newAccident = accidentService.addAccident(accident);
        return new ResponseEntity<>(newAccident, HttpStatus.CREATED);
    }
}
