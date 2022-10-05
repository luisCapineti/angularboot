package com.serviceapi8.objmanager;

import com.serviceapi8.objmanager.model.Objsintetico;
import com.serviceapi8.objmanager.service.ObjetoSinteticoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objsint")
public class ObjResources {
    private final ObjetoSinteticoService objetoSinteticoService;

    public ObjResources(ObjetoSinteticoService objetoSinteticoService) {
        this.objetoSinteticoService = objetoSinteticoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Objsintetico>> getAllObj(){
        List<Objsintetico> objsinteticos = objetoSinteticoService.findAllObj();
        return new ResponseEntity<>(objsinteticos , HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<Objsintetico>> getEmployeeByID(@PathVariable("id") Long id) throws Throwable {
        Objsintetico objsintetico = objetoSinteticoService.findEmployeeById(id);
        return new ResponseEntity(objsintetico , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Objsintetico> addObj(@RequestBody Objsintetico objsintetico) {
        Objsintetico newObjsintetico = objetoSinteticoService.addObj(objsintetico);
        return new ResponseEntity<>(newObjsintetico,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Objsintetico> updateObj(@RequestBody Objsintetico objsintetico) {
        Objsintetico newObjsintetico = objetoSinteticoService.updateObj(objsintetico);
        return new ResponseEntity<>(newObjsintetico,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Objsintetico> deleteObj(@PathVariable("id") Long id) {
        objetoSinteticoService.deleteObj(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
