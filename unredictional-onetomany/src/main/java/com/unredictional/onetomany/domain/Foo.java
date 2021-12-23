package com.unredictional.onetomany.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="FOO")
public class Foo {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID fooId;

    @OneToMany
    @JoinTable(name="FOO_BAR",
            joinColumns = @JoinColumn(name="fooId"),
            inverseJoinColumns = @JoinColumn(name="barId", unique=true))
    private List<Bar> bars;
}
