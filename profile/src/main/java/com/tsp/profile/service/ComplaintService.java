package com.tsp.profile.service;

import com.tsp.profile.Repo.ComplaintRepo;
import com.tsp.profile.model.Complaint;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ComplaintService {

    public final ComplaintRepo complaintRepo;

    @Autowired
    public ComplaintService(ComplaintRepo complaintRepo) {
        this.complaintRepo = complaintRepo;
    }

    public List<Complaint> findAllComplaint() {
        return complaintRepo.findAll();
    }

    public Complaint addComplaint(Complaint complaint) {
        return complaintRepo.save(complaint);
    }
}
