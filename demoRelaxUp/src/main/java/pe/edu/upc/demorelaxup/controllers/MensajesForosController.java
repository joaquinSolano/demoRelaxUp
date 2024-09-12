package pe.edu.upc.demorelaxup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.MensajesForosDTO;
import pe.edu.upc.demorelaxup.entities.MensajesForos;
import pe.edu.upc.demorelaxup.serviceinterfaces.IMensajesForosService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajeforos")
public class MensajesForosController {

    @Autowired
    private IMensajesForosService mfS;

    @GetMapping
    public List<MensajesForosDTO> listar(){

        return mfS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,MensajesForosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MensajesForosDTO dto){
        ModelMapper m=new ModelMapper();
        MensajesForos mp=m.map(dto,MensajesForos.class);
        mfS.insert(mp);
    }

    @GetMapping("/{id}")
    public MensajesForosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        MensajesForosDTO dto=m.map(mfS.listId(id),MensajesForosDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody MensajesForosDTO dto){
        ModelMapper m=new ModelMapper();
        MensajesForos mp=m.map(dto, MensajesForos.class);
        mfS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ mfS.delete(id);}
}

