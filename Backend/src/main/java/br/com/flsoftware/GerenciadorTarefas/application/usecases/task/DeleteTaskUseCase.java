package br.com.flsoftware.GerenciadorTarefas.application.usecases.task;

import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import br.com.flsoftware.GerenciadorTarefas.entities.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTaskUseCase {

    private final TaskRepository taskRepository;

    public void deleteTask(TaskEntity task) {
        // Implementar a lógica de exclusão de usuário
        taskRepository.delete(task);
    }
}
