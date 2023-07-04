package com.tsp.profile.controller;

import com.tsp.profile.model.Complaint;
import com.tsp.profile.model.Contact;
import com.tsp.profile.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/complaint")
public class ComplaintController {
    private final ComplaintService complaintService;

    @Autowired
    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Complaint>> getAllComplaint () {
        List<Complaint> complaints = complaintService.findAllComplaint();
        return new ResponseEntity<>(complaints, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Complaint> createComplaint(@RequestBody Complaint complaint) {
        Complaint newComplaint = complaintService.addComplaint(complaint);
        return new ResponseEntity<>(newComplaint, HttpStatus.CREATED);
    }
}
