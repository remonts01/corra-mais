package br.com.renanmonteiro.corramais.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.renanmonteiro.corramais.entity.Treino;
import br.com.renanmonteiro.corramais.repository.TreinoRepository;

@Service
public class TreinoService {
    
    private TreinoRepository treinoRepository;

    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public List<Treino> create(Treino treino) {
        treinoRepository.save(treino);
        return list();
    }

    public List<Treino> list() {

        Sort sort = Sort.by("descricao");

        return treinoRepository.findAll(sort);
    }

    public List<Treino> update(Treino treino) {
        treinoRepository.save(treino);
        return list();
    }

    public List<Treino> delete(Long id) {
        treinoRepository.deleteById(id);
        return list();
    }
}
