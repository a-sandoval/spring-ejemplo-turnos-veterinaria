package com.example.springboot.models.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Turno {

    private static Long autoincremental = 1l;

    private Long id;

    private String razaPaciente;

    private String nombrePaciente;

    public Turno() {
        this.id = autoincremental;
        autoincremental++;
    }
}