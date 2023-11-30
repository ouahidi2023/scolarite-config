package com.ouahidi.uniteservice.etudiants;

import com.ouahidi.uniteservice.modele.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ETUDIANT-SERVICE")
public interface EtudiantOpenFeing {

    @GetMapping("/etudiants")
    public List<Etudiant> findAll();

    @GetMapping("/etudiants/{id}")
    public Etudiant findById(@PathVariable Long id);

}
