package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Traits;

@Repository
public interface TraitsRepository extends JpaRepository<Traits, Integer> {

}

