package br.unicesumar.edu.sorteador.controllers;

import br.unicesumar.edu.sorteador.model.DadosSorteioModel;
import br.unicesumar.edu.sorteador.model.Response;
import br.unicesumar.edu.sorteador.services.IDadosSorteio;
import br.unicesumar.edu.sorteador.services.impl.DadosSorteioServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/sorteio")
public class SorteioController {

    @Autowired
    private IDadosSorteio iDadosSorteio;

    @PostMapping()
    public Response<List<String>> sorteia(DadosSorteioModel list) {

        Response<List<String>> response = new Response<>();

        try
        {
            List<String> listSorteio = iDadosSorteio.separadorDeParametros(list.getDadosList());
            response.setData(iDadosSorteio.sorteador(listSorteio, list.getQuantidadeSortear(), list.getIsOrdem()));
            response.setStatusCode(HttpStatus.OK.value());
            return response;
        }
        catch (Exception e){
            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setData(new ArrayList<>());
            return response;
        }


    }
}
