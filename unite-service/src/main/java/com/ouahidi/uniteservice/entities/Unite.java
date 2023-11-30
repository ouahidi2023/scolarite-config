package com.ouahidi.uniteservice.entities;

import com.ouahidi.uniteservice.modele.Etudiant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Unite {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUnite;
    private Double note;
    private String description;
    private Long idEtudiant;
    @Transient
    private Etudiant etudiant;



}
