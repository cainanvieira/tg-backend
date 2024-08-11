package tg.schoolapi.model.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class SchedulingDTO {
        private Long id;

        private Long id_usuario;

        private LocalDateTime data_hora;

        private String obs;

        public SchedulingDTO() {
        }

        public SchedulingDTO(Long id, Long id_usuario, LocalDateTime data_hora, String obs) {
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
