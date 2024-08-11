package tg.schoolapi.model.entity;
import jakarta.persistence.*;

@Entity
@Table(
        name = "classes"
)

public class ClassesEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(
            name = "subject"
    )
    private String subject;

    @Column(
            name = "teacherName"
    )
    private String teacherName;

    @Column(
            name = "numberClass"
    )
    private int numberClass;

    public ClassesEntity() {
    }

    public ClassesEntity(Long id, String subject, String teacherName, int numberClass) {
        this.id = id;
        this.subject = subject;
        this.teacherName = teacherName;
        this.numberClass = numberClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(int numberClass) {
        this.numberClass = numberClass;
    }
}
