package br.unicesumar.edu.sorteador.services.impl;

import br.unicesumar.edu.sorteador.services.IDadosSorteio;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DadosSorteioServiceImpl implements IDadosSorteio {


    @Override
    public List<String> separadorDeParametros(String dados) {

        List<String> listTratada = new ArrayList<>();

        if (StringUtils.containsWhitespace(dados)) {
            listTratada = Arrays.stream(dados.split("\\s+")).collect(Collectors.toList());
        } else {
            listTratada = Arrays.stream(dados.split(";")).collect(Collectors.toList());
        }

        return listTratada;

    }

    @Override
    public List<String> sorteador(List<String> listaTratada, String quantidadeSortear, Integer isOrdem) {
        List<String> sorteados = new ArrayList<>();
        for (int i = 1; i <= Integer.valueOf(quantidadeSortear); i++) {
            String sorteio = listaTratada.get(new Random().nextInt(listaTratada.size()));
            while (sorteados.contains(sorteio)) {
                sorteio = listaTratada.get(new Random().nextInt(listaTratada.size()));
            }
            sorteados.add(sorteio);
        }

        return sorteados;

    }
}
