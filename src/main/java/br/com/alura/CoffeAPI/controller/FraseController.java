package br.com.alura.CoffeAPI.controller;

import br.com.alura.CoffeAPI.model.FraseDTO;
import br.com.alura.CoffeAPI.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private final FraseService service;

    public FraseController(FraseService service) {
        this.service = service;
    }

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }


}
