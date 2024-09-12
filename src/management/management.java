package Delima;

import java.time.LocalDate;

public class management { 
    private int taskId;
    private String taskName;
    private String assignedTo;
    private LocalDate dueDate;
    private String priority;
    private String status;

    public management(int taskId, String taskName, String assignedTo, LocalDate dueDate, String priority, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public int getTaskId() { return taskId; }
    public String getTaskName() { return taskName; }
    public String getAssignedTo() { return assignedTo; }
    public LocalDate getDueDate() { return dueDate; }
    public String getPriority() { return priority; }
    public String getStatus() { return status; }

    public void setTaskId(int taskId) { this.taskId = taskId; }
    public void setTaskName(String taskName) { this.taskName = taskName; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Task ID: " + taskId + "\n" +
               "Task Name: " + taskName + "\n" +
               "Assigned To: " + assignedTo + "\n" +
               "Due Date: " + dueDate + "\n" +
               "Priority: " + priority + "\n" +
               "Status: " + status;
    }
}