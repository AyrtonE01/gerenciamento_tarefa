package com.tarefa.tarefa.controller;

import com.tarefa.tarefa.entity.TarefaEntity;
import com.tarefa.tarefa.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public TarefaEntity criar(@RequestBody TarefaEntity tarefa) {
        return service.salvar(tarefa);
    }

    @GetMapping
    public List<TarefaEntity> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<TarefaEntity> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}