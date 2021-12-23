package com.unredictional.onetoone.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="BAR_ONE_TO_ONE")
public class Bar {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID barId;
    //No corresponding mapping to Foo.class
}
