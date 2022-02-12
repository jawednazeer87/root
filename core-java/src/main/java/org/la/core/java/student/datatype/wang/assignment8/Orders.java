package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Orders {
    /*
    11.	Create a class Orders having member variables id, userId, status, createdAt. create getters and
		setters for all member variables. Create object of Orders class in other class inside main method
		and set all member values and print all member values using getters.
     */
    private int id, userId, status;
    private LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
