package com.unredictional.onetoone.repository;


import com.unredictional.onetoone.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FooRepository extends JpaRepository<Foo, UUID> {
}
