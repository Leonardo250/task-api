package com.leo.task_api.Service;

import com.leo.task_api.model.Task;
import com.leo.task_api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Task findById(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public Task save(Task task){
        return taskRepository.save(task);
    }

    public void delete(long id){
        taskRepository.deleteById(id);
    }
}
