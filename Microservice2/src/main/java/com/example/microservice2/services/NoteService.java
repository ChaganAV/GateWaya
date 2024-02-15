package com.example.microservice2.services;

import com.example.microservice2.model.Note;
import com.example.microservice2.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNote(){
        return noteRepository.findAll();
    }
    public Note findById(Long id){
        return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }
}
