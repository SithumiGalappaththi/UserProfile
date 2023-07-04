package com.tsp.profile.controller;

import com.tsp.profile.model.Complaint;
import com.tsp.profile.model.Feedback;
import com.tsp.profile.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("/all") // return all the information
    public ResponseEntity<List<Feedback>> getAllFeedback () {
        List<Feedback> feedbacks = feedbackService.findAllFeedback();
        return new ResponseEntity<>(feedbacks, HttpStatus.OK);
    }

    @PostMapping("/add") //change the backend
    public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback) {
        Feedback newFeedback = feedbackService.addFeedback(feedback);
        return new ResponseEntity<>(newFeedback, HttpStatus.CREATED);
    }
}
