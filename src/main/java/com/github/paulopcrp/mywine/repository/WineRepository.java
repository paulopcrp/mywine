package com.github.paulopcrp.mywine.repository;

import com.github.paulopcrp.mywine.entity.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WineRepository extends JpaRepository<Wine, Long> {
    Optional<Wine> findByName(String name);
}
