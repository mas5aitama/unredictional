package com.unredictional.onetomany.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="BAR")
public class Bar {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid4")
    private UUID barId;
    //No Mapping specified here.
}
