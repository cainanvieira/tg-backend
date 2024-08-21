package tg.schoolapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tg.schoolapi.model.dto.ContentDTO;
import tg.schoolapi.model.dto.UserDTO;
import tg.schoolapi.service.ContentService;
import tg.schoolapi.service.UserService;

import java.util.List;

@RestController
@RequestMapping({"/contents"})
public class ContentController {
    @Autowired
    ContentService service;

    public ContentController() {
    }

    @PostMapping
    public ContentDTO insert(@RequestBody ContentDTO contentDTO) {
        return this.service.insert(contentDTO);
    }

    @GetMapping
    public List<ContentDTO> consultaTodos() {
        return this.service.consultaTodos();
    }

    @PatchMapping("/{id}")
    public ContentDTO update(@PathVariable Long id, @RequestBody ContentDTO contentDTO){
        ContentDTO result = service.update(id, contentDTO);
        return result;
    }

}