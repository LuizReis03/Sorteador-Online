package br.unicesumar.edu.sorteador.services;

import org.springframework.stereotype.Service;

import java.util.List;

public interface IDadosSorteio {

    public List<String> separadorDeParametros(String dados);

    public List<String> sorteador (List<String> listaTratada, String quantidadeSortear, Integer isOrdem);

}
