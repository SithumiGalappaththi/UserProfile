package com.tsp.profile.service;

import com.tsp.profile.Repo.FeedbackRepo;
import com.tsp.profile.model.Feedback;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FeedbackService {

    public final FeedbackRepo feedbackRepo;
    @Autowired
    public FeedbackService(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }

    public List<Feedback> findAllFeedback() {
        return feedbackRepo.findAll();
    }

    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepo.save(feedback);
    }
}
