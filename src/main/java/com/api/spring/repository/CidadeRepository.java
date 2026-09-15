/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.spring.repository;

import com.api.spring.entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author atomi
 */
@Repository
/**
 *
 * @author atomi
 */
public interface CidadeRepository extends JpaRepository <Cidade, Long>{
    
    Optional<Cidade> findByIbge(Integer ibge);


    List<Cidade> findFirst10ByNomeContainingIgnoreCase(String nome);

  
    @Query(value = "SELECT * FROM cidade", nativeQuery = true)
    List<Cidade> listarCidades();
}

