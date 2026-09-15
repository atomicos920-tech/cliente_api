/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.spring.controllers;

import com.api.spring.entidades.Cidade;
import com.api.spring.service.CidadeService;
import com.api.spring.service.ClienteService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author atomi
 */
@RestController
@RequestMapping("/cidades")
@RequiredArgsConstructor
public class CidadeController {
    private final CidadeService cidadeService  ;
    

    public CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    
    

    @GetMapping("/buscar-codigo-ibge/{codigoIbge}")
    public Cidade buscarCidadePorCodigoIbge(@PathVariable Integer codigoIbge) {
        return cidadeService.buscarPorCodigoIbge(codigoIbge);
    }

    @GetMapping("/buscar-cidade-por-nome/{nome}")
    public List<Cidade> buscarCidadePorNome(@PathVariable String nome) {
        return cidadeService.buscarCidadesPorNome(nome);
    }
}
