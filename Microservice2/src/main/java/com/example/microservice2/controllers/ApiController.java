package com.example.microservice2.controllers;

import com.example.microservice2.model.Note;
import com.example.microservice2.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/service2")
@RequiredArgsConstructor
public class ApiController {
    private final NoteService noteService;

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    /*@GetMapping("/notes")
    public ResponseEntity<List<Note>> getAllNote(){
        return new ResponseEntity<>(noteService.getAllNote(), HttpStatus.OK);
    }*/
    @GetMapping("/notes")
    public String findAll(Model model){
        List<Note> notes = noteService.getAllNote();
        model.addAttribute("notes",notes);
        return "notes";
    }

}
