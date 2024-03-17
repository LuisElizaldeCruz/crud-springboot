package com.tcna.primeraweb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@Data//crea getters y setters
@AllArgsConstructor //crear un constructor con todos los campos
@NoArgsConstructor// crea un contructor sin argumentos
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int edad;
}
