package br.com.flsoftware.GerenciadorTarefas.application.usecases.task;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import br.com.flsoftware.GerenciadorTarefas.entities.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetTaskUseCase {
    private final TaskRepository taskRepository;

    public TaskEntity getTask(Long taskId) {
        // Implementar a lógica de obtenção de usuário
        return taskRepository.findById(taskId);
    }
}
