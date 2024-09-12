package pe.edu.upc.demorelaxup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.UsuarioRutinaDTO;
import pe.edu.upc.demorelaxup.entities.UsuarioRutina;
import pe.edu.upc.demorelaxup.serviceinterfaces.IUsuarioRutinaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/UsuarioRutina")
public class UsuarioRutinaController {
    @Autowired
    private IUsuarioRutinaService Uu;
    @GetMapping
    public List<UsuarioRutinaDTO> listar() {

        return Uu.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioRutinaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UsuarioRutinaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioRutina u = m.map(dto, UsuarioRutina.class);
        Uu.insert(u);
    }
    @GetMapping("/{Id}")
    public UsuarioRutinaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioRutinaDTO dto = m.map(Uu.listId(id), UsuarioRutinaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioRutinaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioRutina u = m.map(dto, UsuarioRutina.class);
        Uu.update(u);
    }
    @DeleteMapping("/{Id}")
    public void eliminar(@PathVariable("id") Integer id) {
        Uu.delete(id);
    }
}
