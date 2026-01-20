package com.leo.task_api.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private  String descriptionn;
    private String status;

    @CreationTimestamp // notação para criar a data
    private LocalDateTime createdAt;

}
