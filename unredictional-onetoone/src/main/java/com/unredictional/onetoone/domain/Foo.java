package com.unredictional.onetoone.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="FOO_ONE_TO_ONE")
public class Foo {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID fooId;

    @OneToOne
    private Bar bar;
}