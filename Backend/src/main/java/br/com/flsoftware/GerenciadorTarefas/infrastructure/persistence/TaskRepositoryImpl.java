package br.com.flsoftware.GerenciadorTarefas.infrastructure.persistence;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import br.com.flsoftware.GerenciadorTarefas.entities.repository.TaskRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public TaskEntity save(TaskEntity task) {
        return null;
    }

    @Override
    public TaskEntity findById(Long id) {
        return null;
    }

    @Override
    public void delete(TaskEntity task) {

    }
}
