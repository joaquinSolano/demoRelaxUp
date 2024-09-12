package pe.edu.upc.demorelaxup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.MetodoPagoDTO;
import pe.edu.upc.demorelaxup.entities.MetodoPago;
import pe.edu.upc.demorelaxup.serviceinterfaces.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metodos")
public class MetodoPagoController {

    @Autowired
    private IMetodoPagoService mpS;

    @GetMapping
    public List<MetodoPagoDTO> listar(){

        return mpS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,MetodoPagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago mp=m.map(dto,MetodoPago.class);
        mpS.insert(mp);
    }

    @GetMapping("/{id}")
    public MetodoPagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        MetodoPagoDTO dto=m.map(mpS.listId(id),MetodoPagoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago mp=m.map(dto,MetodoPago.class);
        mpS.update(mp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ mpS.delete(id);}
}
