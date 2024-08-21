package tg.schoolapi.controller;

import tg.schoolapi.model.dto.UserDTO;
import tg.schoolapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
public class UserController {
    @Autowired
    UserService injecao;

    public UserController() {
    }

    @PostMapping
    public UserDTO insert(@RequestBody UserDTO userDTO) {
        return this.injecao.insert(userDTO);
    }

    @GetMapping
    public List<UserDTO> consultaTodos() {
        return this.injecao.consultaTodos();
    }

    @PutMapping
    public List<UserDTO> alteraSenha(){
        return injecao.alteraSenha();
    }

    @PatchMapping("/password/{id}")
    public UserDTO atualizarSenhaId(@PathVariable Long id, @RequestBody UserDTO userDTO){
        UserDTO userDTO1 = injecao.atualizarSenhaId(id, userDTO);
        return userDTO1;
    }
    @PatchMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
        UserDTO userDTO1 = injecao.atualizaUser(id, userDTO);
        return userDTO1;
    }

}