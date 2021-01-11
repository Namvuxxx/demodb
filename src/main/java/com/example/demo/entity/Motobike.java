package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Motobike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String no;
    private Date dateExpired;

    @ManyToOne
    private Person person;
}
