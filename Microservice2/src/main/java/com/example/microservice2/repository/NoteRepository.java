package com.example.microservice2.repository;

import com.example.microservice2.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    public Optional<Note> findById(Long id);
}
