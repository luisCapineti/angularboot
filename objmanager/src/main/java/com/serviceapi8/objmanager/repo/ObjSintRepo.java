package com.serviceapi8.objmanager.repo;

import com.serviceapi8.objmanager.model.Objsintetico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ObjSintRepo extends JpaRepository<Objsintetico,Long> {
    void deleteObjById(Long id);

    Optional<Objsintetico> findObjById(Long id);
}
