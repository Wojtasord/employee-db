package pl.sda.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryTaskDB implements TaskDB {

    private Collection<Task> tasks;

    public InMemoryTaskDB() {
        tasks = new ArrayList<>();
    }

    @Override
    public long add(Task task) {
        long id = generateId();
        Task taskCopy = new Task(task, id);
        tasks.add(taskCopy);
        return id;
    }

    @Override
    public Iterable<Task> findAll() {
        return tasks;
    }

    @Override
    public Optional<Task> findById(long id) {
        return tasks.stream().filter(task -> task.getId() == id)
                .findAny();
    }

    @Override
    public Iterable<Task> findByType(TaskType type) {
        return tasks.stream().filter(task -> task.getTaskType() == type).collect(Collectors.toList());
    }

    @Override
    public Iterable<Task> findByPriority(TaskPriority priority) {
        return tasks.stream().filter(task -> task.getPriority() == priority).collect(Collectors.toList());
    }

    private long generateId() {
        return tasks.size() + 1;
    }
}
