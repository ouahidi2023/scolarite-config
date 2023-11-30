package com.ouahidi.etudiantservice.web;

import com.ouahidi.etudiantservice.config.EtudiantConfig;
import com.ouahidi.etudiantservice.config.GlobalConfig;
import com.ouahidi.etudiantservice.entities.Etudiant;
import com.ouahidi.etudiantservice.repositories.EtudaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantRestControler {
/*
   @Value("${global.params.p1}")
    int p1;
    @Value("${global.params.p2}")
    int p2;
    @Value("${etudiant.params.x}")
    int x;
    @Value("${etudiant.params.y}")
    int y;

    @GetMapping("/testConfig")
    public Map<String, Integer> configTest(){
        return Map.of("p1",p1, "p2",p2, "x",x, "y",y);

    }


 */

    @Autowired
    private EtudaintRepository etudaintRepository ;
    @Autowired
    private GlobalConfig globalConfig;
    @Autowired
    private EtudiantConfig etudiantConfig;

    @GetMapping("/globalConfig")
    public GlobalConfig globalConfig(){ return globalConfig;}

    @GetMapping("/etudiantConfig")
    public EtudiantConfig etudiantConfig(){return etudiantConfig;}



@GetMapping("/etudiants")
    public List<Etudiant> findall(){

        return etudaintRepository.findAll();
    }

    @GetMapping("/etudiants/{id}")
    public Etudiant findById(@PathVariable Long id){

        return etudaintRepository.findById(id).get();
    }
}
