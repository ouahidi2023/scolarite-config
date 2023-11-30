package com.ouahidi.uniteservice;

import com.ouahidi.uniteservice.entities.Unite;
import com.ouahidi.uniteservice.repositories.UniteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class UniteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniteServiceApplication.class, args);
    }

@Bean
    CommandLineRunner start (UniteRepository uniteRepository)
    { return args -> {
        Unite  u1 = Unite.builder()
                .note(16.0)
                .description(("Algebre 1"))
                .idEtudiant(1L)
                .build();
        uniteRepository.save(u1);
        Unite  u2 = Unite.builder()
                .note(16.0)
                .description("Analyse 1")
                .idEtudiant(1L)
                .build();
        uniteRepository.save(u2);
        Unite  u3 = Unite.builder()
                .note(16.0)
                .description("Algebre 1")
                .idEtudiant(2L)
                .build();
        uniteRepository.save(u3);

        Unite  u4 = Unite.builder()
                .note(16.0)
                .description("Algebre 1")
                .idEtudiant(3L)
                .build();
        uniteRepository.save(u4);
    };

    }
}
