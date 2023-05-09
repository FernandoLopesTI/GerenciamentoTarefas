package br.com.flsoftware.GerenciadorTarefas.application.usecases.task;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import br.com.flsoftware.GerenciadorTarefas.entities.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTaskUseCase {
    private final TaskRepository taskRepository;

    public TaskEntity createTask(TaskEntity task) {
        // Implementar a lógica de criação de usuário
        return taskRepository.save(task);
    }
}
