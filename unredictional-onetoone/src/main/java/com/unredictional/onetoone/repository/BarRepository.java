package com.unredictional.onetoone.repository;

import com.unredictional.onetoone.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BarRepository extends JpaRepository<Bar, UUID> {
}
