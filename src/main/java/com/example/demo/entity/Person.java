package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Person {

    @Id
    private long id;
    private String name;
    private int age;
    private String sex;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id",referencedColumnName = "id")
    private  List<Car> cars;

    @ManyToOne
    @JoinColumn(name = "home_id",referencedColumnName = "id")
    public Home home;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id",referencedColumnName = "id")
    private List<Motobike> motobikes;
}
