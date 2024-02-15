package com.example.microservice2;

import com.example.microservice2.model.Note;
import com.example.microservice2.repository.NoteRepository;
import com.example.microservice2.services.NoteService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Microservice2Application {
    public static void main(String[] args) {
        SpringApplication.run(Microservice2Application.class, args);

    }
    @Bean
    public CommandLineRunner dataLoader(NoteRepository repo){
        return args -> {
            repo.save(new Note(1,"прогулка","прогулка по лесу"));
            repo.save(new Note(2,"магазин","за продуктами"));
        };
    }
}
