package com.example.tasktracker.service;

import com.example.tasktracker.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Task addTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    public boolean deleteTask(Long id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }
}