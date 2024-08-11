package tg.schoolapi.service;

import tg.schoolapi.model.dto.ClassesDTO;
import tg.schoolapi.model.entity.ClassesEntity;
import tg.schoolapi.model.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ClassesService {
    @Autowired
    ClassesRepository injecao;

    public ClassesService() {
    }

    public ClassesDTO insert(ClassesDTO classesDTO) {
        ClassesEntity classesEntity = this.converteDTO(classesDTO);
        return this.converteEntity((ClassesEntity)this.injecao.save(classesEntity));
    }

    public ClassesDTO getClasse(Long id) {
        Optional<ClassesEntity> classe = this.injecao.findById(id);
        return classe.isPresent() ? this.converteEntity((ClassesEntity)classe.get()) : null;
    }

    public String deleteClass(Long id) {
        if (this.injecao.existsById(id)) {
            this.injecao.deleteById(id);
            return "Removida com sucesso!";
        } else {
            return "Aula não encontrada";
        }
    }

    public List<ClassesDTO> getAll() {
        return this.converteEntities(this.injecao.findAll());
    }

    public List<ClassesDTO> converteEntities(List<ClassesEntity> listaEntities) {
        List<ClassesDTO> listaDTOs = new ArrayList();
        Iterator var3 = listaEntities.iterator();

        while(var3.hasNext()) {
            ClassesEntity objEntity = (ClassesEntity)var3.next();
            listaDTOs.add(this.converteEntity(objEntity));
        }

        return listaDTOs;
    }



    public ClassesEntity converteDTO(ClassesDTO classesDTO) {
        return new ClassesEntity(classesDTO.getId(), classesDTO.getSubject(), classesDTO.getTeacherName(), classesDTO.getNumberClass());
    }

    public ClassesDTO converteEntity(ClassesEntity classesEntity) {
        return new ClassesDTO(classesEntity.getId(), classesEntity.getSubject(), classesEntity.getTeacherName(), classesEntity.getNumberClass());

    }


}
