package br.com.alura.CoffeAPI.service;

import br.com.alura.CoffeAPI.model.Frase;
import br.com.alura.CoffeAPI.model.FraseDTO;
import br.com.alura.CoffeAPI.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraseService {

    @Autowired
    private final FraseRepository repository;

    public FraseService(FraseRepository repository) {
        this.repository = repository;
    }


    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
