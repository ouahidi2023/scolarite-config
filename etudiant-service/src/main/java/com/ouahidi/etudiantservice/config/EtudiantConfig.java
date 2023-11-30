package com.ouahidi.etudiantservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "etudiant.params")
@Setter @Getter
public class EtudiantConfig {
    int x;
    int y;
}
