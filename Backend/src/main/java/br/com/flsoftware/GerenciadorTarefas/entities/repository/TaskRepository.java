package br.com.flsoftware.GerenciadorTarefas.entities.repository;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;

public interface TaskRepository {
    TaskEntity save(TaskEntity task);
    TaskEntity findById(Long id);
    void delete(TaskEntity task);
}
