package com.ouahidi.etudiantservice.repositories;

import com.ouahidi.etudiantservice.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudaintRepository extends JpaRepository  <Etudiant,Long> {
}
