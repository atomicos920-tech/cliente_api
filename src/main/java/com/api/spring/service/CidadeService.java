/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.spring.service;
    import com.api.spring.entidades.Cidade;
import com.api.spring.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
/**
 *
 * @author atomi
 */

public class CidadeService {

    public CidadeService(com.api.spring.repository.CidadeRepository CidadeRepository) {
        this.CidadeRepository = CidadeRepository;
    }
   private  final CidadeRepository CidadeRepository ;

    public Cidade buscarPorCodigoIbge(Integer codigoIbge) {
        Cidade cidade = CidadeRepository.findByIbge(codigoIbge).orElseThrow(() -> new RuntimeException("Cidade não encontrada!"));
        return cidade;
    }

    public List<Cidade> buscarCidadesPorNome(String nome) {
        List<Cidade> cidadesListadas = CidadeRepository.findFirst10ByNomeContainingIgnoreCase(nome);
        return cidadesListadas;
    }
}
