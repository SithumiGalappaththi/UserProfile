package com.tsp.profile.service;

import com.tsp.profile.Repo.AccidentRepo;
import com.tsp.profile.Repo.LostRepo;
import com.tsp.profile.model.Accident;
import com.tsp.profile.model.Lost;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AccidentService {
    public final AccidentRepo accidentRepo;
    @Autowired
    public AccidentService(AccidentRepo accidentRepo) {
        this.accidentRepo = accidentRepo;
    }

    public List<Accident> findAllAccident() {
        return accidentRepo.findAll();
    }
    public Accident addAccident(Accident accident) {
        return accidentRepo.save(accident);
    }

}
