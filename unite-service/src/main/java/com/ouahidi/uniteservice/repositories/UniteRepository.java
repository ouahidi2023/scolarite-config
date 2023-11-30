package com.ouahidi.uniteservice.repositories;

import com.ouahidi.uniteservice.entities.Unite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniteRepository extends JpaRepository<Unite,Long> {
}
