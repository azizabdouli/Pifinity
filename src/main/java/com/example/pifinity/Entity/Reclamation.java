package com.example.pifinity.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Entity
@Getter
@Setter
@ToString
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private Date date;
    @ToString.Exclude
    private String description;
    @ManyToOne
    private  User user;



}
