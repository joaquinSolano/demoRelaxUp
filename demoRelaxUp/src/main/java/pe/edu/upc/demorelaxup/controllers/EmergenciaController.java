package pe.edu.upc.demorelaxup.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.EmergenciaDTO;
import pe.edu.upc.demorelaxup.entities.Emergencia;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEmergenciaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emergencias")
public class EmergenciaController {

    @Autowired
    private IEmergenciaService eS;

    @GetMapping
    public List<EmergenciaDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EmergenciaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EmergenciaDTO dto){
        ModelMapper m=new ModelMapper();
        Emergencia er=m.map(dto,Emergencia.class);
        eS.insert(er);
    }
}
