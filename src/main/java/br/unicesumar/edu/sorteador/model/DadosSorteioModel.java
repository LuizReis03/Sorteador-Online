package br.unicesumar.edu.sorteador.model;

import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import java.util.List;

public class DadosSorteioModel{

    private String dadosList;

    private String quantidadeSortear;

    private Integer isOrdem;

    public DadosSorteioModel(String dadosList, String quantidadeSortear, Integer isOrdem) {
        this.dadosList = dadosList;
        this.quantidadeSortear = quantidadeSortear;
        this.isOrdem = isOrdem;
    }

    public String getDadosList() {
        return dadosList;
    }

    public void setDadosList(String dadosList) {
        this.dadosList = dadosList;
    }

    public Integer getIsOrdem() {
        return isOrdem;
    }

    public void setIsOrdem(Integer isOrdem) {
        this.isOrdem = isOrdem;
    }

    public String getQuantidadeSortear() {
        return quantidadeSortear;
    }

    public void setQuantidadeSortear(String quantidadeSortear) {
        this.quantidadeSortear = quantidadeSortear;
    }


}
