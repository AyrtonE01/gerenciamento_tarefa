package com.tarefa.tarefa.service;

import com.tarefa.tarefa.entity.TarefaEntity;
import com.tarefa.tarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaEntity salvar(TarefaEntity tarefa) {
        return repository.save(tarefa);
    }

    public List<TarefaEntity> listar() {
        return repository.findAll();
    }

    public Optional<TarefaEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}