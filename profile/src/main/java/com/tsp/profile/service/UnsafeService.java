package com.tsp.profile.service;

import com.tsp.profile.Repo.AccidentRepo;
import com.tsp.profile.Repo.UnsafeRepo;
import com.tsp.profile.model.Accident;
import com.tsp.profile.model.Unsafe;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UnsafeService {
    public final UnsafeRepo unsafeRepo;
    @Autowired
    public UnsafeService(UnsafeRepo unsafeRepo) {
        this.unsafeRepo = unsafeRepo;
    }

    public List<Unsafe> findAllUnsafe() {
        return unsafeRepo.findAll();
    }
    public Unsafe addUnsafe(Unsafe unsafe) {
        return unsafeRepo.save(unsafe);
    }
}
