package com.salt.repository;

import com.salt.model.Konsumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KonsumenRepository extends JpaRepository<Konsumen,Long> {
}
