package com.example.microservice2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    /**
     * уникальный номер
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    /**
     * заголовок
     */
    @Column(nullable = false,name="title",length = 50)
    private String title;
    /**
     * описание
     */
    @Column(nullable = false,name="description",length = 400)
    private String description;
}
