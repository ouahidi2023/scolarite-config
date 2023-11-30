package com.ouahidi.etudiantservice.config;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class GlobalConfig {
    int p1;
    int p2;
}
