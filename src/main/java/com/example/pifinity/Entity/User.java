package com.example.pifinity.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String lirstName;
    private String lastName;
    private String email ;
    private String Password;
    private long numTel;
    private Date BirthDate;
    @ToString.Exclude
    private String Nationality;
    @OneToMany(mappedBy = "user")
    private Set<Reclamation> reclamations;


}
