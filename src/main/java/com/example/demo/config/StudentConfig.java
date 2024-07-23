package com.example.demo.config;


import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dean = new Student(
                    "Dean",
                    "dean.win@gmail.com",
                    LocalDate.of(1979, Month.JANUARY, 24)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.win@gmail.com",
                    LocalDate.of(1980, Month.MARCH, 29)
            );

            repository.saveAll(List.of(dean, alex));
        };
    }
}
