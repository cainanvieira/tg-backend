package tg.schoolapi.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "scheduling")
public class SchedulingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "data_hora")
    private LocalDateTime data_hora;

    @Column(name = "obs")
    private String obs;

    public SchedulingEntity() {
    }

    public SchedulingEntity(Long id, Long id_usuario, LocalDateTime data_hora, String obs) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.data_hora = data_hora;
        this.obs = obs;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }
}
