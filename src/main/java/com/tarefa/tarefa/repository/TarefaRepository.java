package com.tarefa.tarefa.repository;

import com.tarefa.tarefa.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaEntity,Long> {
}
