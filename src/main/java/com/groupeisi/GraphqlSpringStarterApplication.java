package com.groupeisi;

import com.groupeisi.entities.Student;
import com.groupeisi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlSpringStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSpringStarterApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentRepository studentRepository) {
        return args -> {
        List.of("Thiare", "Mamadou", "Moussa", "Fatou", "Awa").forEach(name -> studentRepository.save(new Student(null, name, name + "@gmail.com", "77 123 45 67")));
            studentRepository.findAll().forEach(System.out::println);
        };
    }
}