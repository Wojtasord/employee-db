package pl.sda.task;

import java.util.Optional;

public interface TaskDB {
    long add(Task task);

    Iterable<Task> findAll();

    Optional<Task> findById(long id);

    Iterable<Task> findByType(TaskType type);

    Iterable<Task> findByPriority(TaskPriority priority);
}
