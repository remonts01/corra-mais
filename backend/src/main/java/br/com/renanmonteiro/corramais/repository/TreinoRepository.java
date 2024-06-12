package br.com.renanmonteiro.corramais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanmonteiro.corramais.entity.Treino;

public interface TreinoRepository extends JpaRepository <Treino, Long> {
    
}
