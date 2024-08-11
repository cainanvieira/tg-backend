package tg.schoolapi.model.repository;

import tg.schoolapi.model.entity.ClassesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<ClassesEntity, Long> {

}
