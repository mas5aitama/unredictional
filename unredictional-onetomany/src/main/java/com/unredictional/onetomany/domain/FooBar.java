package com.unredictional.onetomany.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="FOO_BAR")
public class FooBar {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID fooBarId;

    @ManyToOne
    @JoinColumn(name = "fooId")
    private Foo foo;

    @ManyToOne
    @JoinColumn(name = "barId", unique = true)
    private Bar bar;
    //You can store other objects/fields on this table here.
}

