package com.api.spring.repository;

import com.api.spring.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


/* METODO HARDCODED PARA INJECAO DE DEPENCIA NO CASO CLIENTE REPOSITORY
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    

 */

    /**
     *
     * @param Cliente
     * @return
     */


    
    }

    
