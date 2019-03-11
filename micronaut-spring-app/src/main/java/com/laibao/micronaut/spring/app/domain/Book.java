package com.laibao.micronaut.spring.app.domain;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = -365661441174075489L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "title")
    public String title;
}
