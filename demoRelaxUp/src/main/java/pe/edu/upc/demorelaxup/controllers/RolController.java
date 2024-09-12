package pe.edu.upc.demorelaxup.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.RolDTO;
import pe.edu.upc.demorelaxup.entities.Rol;
import pe.edu.upc.demorelaxup.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rR;

    @GetMapping
    public List<RolDTO>listar(){

        return rR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol ro=m.map(dto,Rol.class);
        rR.insert(ro);
    }

    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RolDTO dto=m.map(rR.listId(id),RolDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol ro=m.map(dto,Rol.class);
        rR.update(ro);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rR.delete(id);
    }

    @GetMapping("/busquedas")
    public List<RolDTO>buscar(@RequestParam String nombre){
        return rR.buscarNombre(nombre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
}
