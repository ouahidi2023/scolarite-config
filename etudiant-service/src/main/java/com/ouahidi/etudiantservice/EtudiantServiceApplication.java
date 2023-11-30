package com.ouahidi.etudiantservice;

import com.ouahidi.etudiantservice.config.EtudiantConfig;
import com.ouahidi.etudiantservice.config.GlobalConfig;
import com.ouahidi.etudiantservice.entities.Etudiant;
import com.ouahidi.etudiantservice.repositories.EtudaintRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class, EtudiantConfig.class})

public class EtudiantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtudiantServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(EtudaintRepository etudaintRepository )
    { return args->{
        Etudiant e1 = Etudiant.builder()
                .age(22)
                .nom("Rami")
                .build();
        etudaintRepository.save(e1);

        Etudiant e2 = Etudiant.builder()
                .age(26)
                .nom("Ramzi")
                .build();
        etudaintRepository.save(e2);

        Etudiant e3= Etudiant.builder()
                .age(25)
                .nom("Hilali")
                .build();
        etudaintRepository.save(e3);
        Etudiant e4 = Etudiant.builder()
                .age(20)
                .nom("yaccoubi")
                .build();
        etudaintRepository.save(e4);


    };

    }
}
