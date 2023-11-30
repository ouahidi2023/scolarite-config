package com.ouahidi.uniteservice.web;

import com.ouahidi.uniteservice.entities.Unite;
import com.ouahidi.uniteservice.etudiants.EtudiantOpenFeing;
import com.ouahidi.uniteservice.modele.Etudiant;
import com.ouahidi.uniteservice.repositories.UniteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UniteRestControler {

    @Autowired
    private UniteRepository uniteRepository ;

    @Autowired
    private EtudiantOpenFeing etudiantOpenFeing;

    @GetMapping("/unites")
    public List<Unite> findall(){

        List<Unite> lu=uniteRepository.findAll();
        List<Etudiant> le =etudiantOpenFeing.findAll();

        for (Unite u:lu)
        for (Etudiant e:le)
                if (u.getIdEtudiant()==e.getIdEtudiant())
                {  u.setEtudiant(e);
                    break;
            }
        return lu;
    }

    @GetMapping("/unites/{id}")
    public Unite findById(@PathVariable Long id){

        Unite u= uniteRepository.findById(id).get();

        Etudiant e =etudiantOpenFeing.findById(u.getIdEtudiant());

        u.setEtudiant(e);
        return u;
    }
}
