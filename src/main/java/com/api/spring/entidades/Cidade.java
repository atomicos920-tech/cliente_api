/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.spring.entidades;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author atomi
 */
@Entity
public class Cidade {
     @Id
    private Long id;
    private String nome;
    @JoinColumn(name = "uf")
    @ManyToOne
    private Estado estado;
    private Integer ibge;

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cidade)) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(id, cidade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
