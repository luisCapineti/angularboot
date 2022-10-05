package com.serviceapi8.objmanager.service;

import com.serviceapi8.objmanager.exception.UserNotFoundException;
import com.serviceapi8.objmanager.model.Objsintetico;
import com.serviceapi8.objmanager.repo.ObjSintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ObjetoSinteticoService {
    private  final ObjSintRepo objSintRepo;

    @Autowired
    public ObjetoSinteticoService(ObjSintRepo objSintRepo) {
        this.objSintRepo = objSintRepo;
    }

    public Objsintetico addObj(Objsintetico objsintetico){
        objsintetico.setObjCode(UUID.randomUUID().toString());
        return objSintRepo.save(objsintetico);
    }

    public List<Objsintetico> findAllObj(){
        return objSintRepo.findAll();
    }

    public Objsintetico updateObj(Objsintetico objsintetico){
        return objSintRepo.save(objsintetico);
    }

    public Objsintetico findEmployeeById(Long id) throws Throwable {
        return objSintRepo.findObjById(id)
                .orElseThrow(() -> new UserNotFoundException("El usuario" + id + "no existe"));
    }

    public void deleteObj(Long id){
        objSintRepo.deleteObjById(id);
    }
}
