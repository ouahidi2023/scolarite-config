package com.ouahidi.etudiantservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Etudiant {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private Integer age;

}
