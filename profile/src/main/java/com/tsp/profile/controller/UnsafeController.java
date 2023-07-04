package com.tsp.profile.controller;

import com.tsp.profile.model.Accident;
import com.tsp.profile.model.Unsafe;
import com.tsp.profile.service.AccidentService;
import com.tsp.profile.service.UnsafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/unsafe")
public class UnsafeController {
    private final UnsafeService unsafeService;

    @Autowired
    public UnsafeController(UnsafeService unsafeService) {
        this.unsafeService = unsafeService;
    }
    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Unsafe>> getAllUnsafe () {
        List<Unsafe> unsafes = unsafeService.findAllUnsafe();
        return new ResponseEntity<>(unsafes, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Unsafe> createUnsafe(@RequestBody Unsafe unsafe) {
        Unsafe newUnsafe = unsafeService.addUnsafe(unsafe);
        return new ResponseEntity<>(newUnsafe, HttpStatus.CREATED);
    }
}
