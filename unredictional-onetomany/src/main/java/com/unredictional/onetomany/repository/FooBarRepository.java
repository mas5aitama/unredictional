package com.unredictional.onetomany.repository;

import com.unredictional.onetomany.domain.FooBar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FooBarRepository extends JpaRepository<FooBar, UUID> {
}
