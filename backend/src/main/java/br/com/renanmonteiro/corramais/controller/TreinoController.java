package br.com.renanmonteiro.corramais.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renanmonteiro.corramais.entity.Treino;
import br.com.renanmonteiro.corramais.service.TreinoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/treinos")
public class TreinoController {
    
    private TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @PostMapping
    List<Treino> create(@RequestBody @Valid Treino treino) {
        return treinoService.create(treino);
    }

    @GetMapping
    List<Treino> list() {
        return treinoService.list();
    }

    @PutMapping
    List<Treino> update(@RequestBody Treino treino) {
        return treinoService.update(treino);
    }

    @DeleteMapping("{id}")
    List<Treino> delete(@PathVariable("id") Long id) {
        return treinoService.delete(id);
    }
}
