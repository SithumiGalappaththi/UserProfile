package com.tsp.profile.Repo;

import com.tsp.profile.model.Unsafe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnsafeRepo extends JpaRepository<Unsafe,Long> {
    Unsafe save(Unsafe unsafe);

    List<Unsafe> findAll();
}
