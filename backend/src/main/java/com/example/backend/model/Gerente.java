package com.example.backend.model;

import jakarta.persistence.*;

@Entity
public class Gerente {

    @Id @GeneratedValue
    private Long id;

    @OneToOne
    private Funcionario funcionario;

}
