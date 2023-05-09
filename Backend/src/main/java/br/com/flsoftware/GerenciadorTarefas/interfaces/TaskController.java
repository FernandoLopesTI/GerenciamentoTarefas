package br.com.flsoftware.GerenciadorTarefas.interfaces;

import br.com.flsoftware.GerenciadorTarefas.application.usecases.task.CreateTaskUseCase;
import br.com.flsoftware.GerenciadorTarefas.application.usecases.task.DeleteTaskUseCase;
import br.com.flsoftware.GerenciadorTarefas.application.usecases.task.GetTaskUseCase;
import br.com.flsoftware.GerenciadorTarefas.application.usecases.task.UpdateTaskUseCase;
import br.com.flsoftware.GerenciadorTarefas.entities.TaskEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;
    private final GetTaskUseCase getTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;

    @PostMapping
    public ResponseEntity<TaskEntity> createTask(@RequestBody TaskEntity task) {
        var createdTask = createTaskUseCase.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskEntity> getTask(@PathVariable("id") Long taskId) {
        var task = getTaskUseCase.getTask(taskId);
        if (task != null) {
            return new ResponseEntity<>(task, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskEntity> updateTask(@PathVariable("id") Long taskId, @RequestBody TaskEntity task) {
        var updatedTask = updateTaskUseCase.updateTask(task);
        if (updatedTask != null) {
            return new ResponseEntity<>(updatedTask, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long taskId) {
        var task = getTaskUseCase.getTask(taskId);
        if (task != null) {
            deleteTaskUseCase.deleteTask(task);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
