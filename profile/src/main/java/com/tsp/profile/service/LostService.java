package com.tsp.profile.service;

import com.tsp.profile.Repo.LostRepo;
import com.tsp.profile.model.Lost;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class LostService {

    public final LostRepo lostRepo;
    @Autowired
    public LostService(LostRepo lostRepo) {
        this.lostRepo = lostRepo;
    }

    public List<Lost> findAllLost() {
        return lostRepo.findAll();
    }

    public Lost addLost(Lost lost) {
        return lostRepo.save(lost);
    }
}
