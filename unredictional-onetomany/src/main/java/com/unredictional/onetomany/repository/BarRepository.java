package com.unredictional.onetomany.repository;

import com.unredictional.onetomany.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BarRepository extends JpaRepository<Bar, UUID> {
}
