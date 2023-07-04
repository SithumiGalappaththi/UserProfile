package com.tsp.profile.Repo;

import com.tsp.profile.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepo extends JpaRepository<Feedback,Long> {
    List<Feedback> findAll();

    Feedback save(Feedback feedback);
}
