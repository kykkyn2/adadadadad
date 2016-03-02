package com.adwitt.google.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by PJH on 2016-03-02.
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
}
