package pl.sda.task;

import pl.sda.employee.Employee;

import java.util.Objects;

public class Task {
    private long id;
    private String title;
    private Employee employee;
    private TaskType taskType;
    private TaskPriority priority;

    public Task() {
    }

    public Task(Task task, long id) {
        this.id = id;
        title = task.title;
        taskType = task.taskType;
        priority = task.priority;
    }

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, TaskType taskType) {
        this(title);
        this.taskType = taskType;
    }

    public Task(String title, TaskType taskType, TaskPriority priority) {

        this.title = title;
        this.taskType = taskType;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployee(Employee employee) {

        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskPriority getPriority() {
        return priority;
    }
}
