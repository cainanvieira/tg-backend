package tg.schoolapi.controller;

import tg.schoolapi.model.dto.ClassesDTO;
import tg.schoolapi.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/classes"})
public class ClassesController {
    @Autowired
    ClassesService injecao;

    public ClassesController() {
    }

    @PostMapping
    public ClassesDTO insert(@RequestBody ClassesDTO classesDTO) {
        return this.injecao.insert(classesDTO);
    }

    @GetMapping
    public List<ClassesDTO> consultaTodos() {
        return this.injecao.getAll();
    }

    @GetMapping({"/{id}"})
    public ClassesDTO consultaPorId(@PathVariable Long id) {
        return this.injecao.getClasse(id);
    }

//    @DeleteMapping({"/{id}"})
//    public String remove(@PathVariable Long id) {
//        return this.injecao.remove(id);
//    }
//
//    @PutMapping //recebo alguma coisa como parametro?
//    //chama a funcao igual no service
//    public List<ClassesDTO> alteraSenha(){
//        return injecao.alteraSenha();
//    }

}
