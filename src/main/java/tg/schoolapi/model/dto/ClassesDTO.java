package tg.schoolapi.model.dto;

public class ClassesDTO {
    private Long id;
    private String subject;
    private String teacherName;
    private int numberClass;

    public ClassesDTO() {
    }

    public ClassesDTO(Long id, String subject, String teacherName, int numberClass) {
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
