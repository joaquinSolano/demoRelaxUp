package pe.edu.upc.demorelaxup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demorelaxup.dtos.PlanesDTO;
import pe.edu.upc.demorelaxup.dtos.TotalIngresosbyPlanDTO;
import pe.edu.upc.demorelaxup.dtos.TotalSuscripcionesByPlanDTO;
import pe.edu.upc.demorelaxup.entities.Planes;
import pe.edu.upc.demorelaxup.serviceinterfaces.IPlanesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/planes")
public class PlanesController {
    @Autowired
    private IPlanesService pS;

    @GetMapping
    public List<PlanesDTO> listar(){

        return pS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,PlanesDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PlanesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PlanesDTO dto=m.map(pS.listId(id),PlanesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PlanesDTO dto){
        ModelMapper m=new ModelMapper();
        Planes ci=m.map(dto,Planes.class);
        pS.update(ci);
    }

    @GetMapping("/cantidades")
    public List<TotalSuscripcionesByPlanDTO> obtenerCantidad(){
        List<String[]>lista=pS.totalSuscripcion();
        List<TotalSuscripcionesByPlanDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            TotalSuscripcionesByPlanDTO dto=new TotalSuscripcionesByPlanDTO();
            dto.setNamePlan(columna[0]);
            dto.setTotalSusByPlan(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/ingresos")
    public List<TotalIngresosbyPlanDTO> obtenerMonto(){
        List<String[]>lista=pS.totalIngreso();
        List<TotalIngresosbyPlanDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            TotalIngresosbyPlanDTO dto=new TotalIngresosbyPlanDTO();
            dto.setNamePlan(columna[0]);
            dto.setTotalMoneyByPlan(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;

    }
}
