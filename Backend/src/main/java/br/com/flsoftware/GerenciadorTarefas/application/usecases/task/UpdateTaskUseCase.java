package br.com.flsoftware.GerenciadorTarefas.application.usecases.task;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import br.com.flsoftware.GerenciadorTarefas.entities.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateTaskUseCase {
    private final TaskRepository taskRepository;

    public TaskEntity updateTask(TaskEntity task) {
        // Implementar a lógica de atualização de usuário
        return taskRepository.save(task);
    }

}
