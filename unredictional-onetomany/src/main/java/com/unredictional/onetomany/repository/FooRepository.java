package com.unredictional.onetomany.repository;

import com.unredictional.onetomany.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FooRepository extends JpaRepository<Foo, UUID> {
}
